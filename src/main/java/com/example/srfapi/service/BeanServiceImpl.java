package com.example.srfapi.service;

import com.example.srfapi.model.Bean;
import com.example.srfapi.repository.BeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

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
        return null;
    }

    @Override
    public Bean saveBean(Bean bean) {
        return beanRepository.save(bean);
    }

    @Override
    public Bean deleteBean(Bean bean) {
        return null;
    }

    @Override
    public Bean updateBwan(Long id, Bean bean) {
        return null;
    }
}
