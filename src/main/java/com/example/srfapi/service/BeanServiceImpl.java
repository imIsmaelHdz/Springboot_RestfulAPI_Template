package com.example.srfapi.service;

import com.example.srfapi.model.Bean;
import com.example.srfapi.repository.BeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BeanServiceImpl implements BeanService{
    @Autowired
    BeanRepository beanRepository;
    @Override
    public List<Bean> getAllBeans() {
        List<Bean> beans = new ArrayList<Bean>();
        beanRepository.findAll().forEach(beans::add);
        return beans;
    }
    @Override
    public Bean getBeanById(Long id) {
        Optional<Bean> bean = beanRepository.findById(id);
        return bean.orElse(null);
    }
    @Override
    public Bean saveBean(Bean bean) {
        return beanRepository.save(bean);
    }

    @Override
    public String deleteBean(Long id) {
        beanRepository.deleteById(id);
        return "id"+ id + "was delete successfully";
    }
    @Override
    public Bean updateBean(Long id, Bean bean) {
        return null;
    }

    @Override
    public Long countBeans() {return beanRepository.count();}
}
