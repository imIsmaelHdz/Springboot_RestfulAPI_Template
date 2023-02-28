package com.example.srfapi.service;

import com.example.srfapi.model.Bean;

import java.util.List;

public interface BeanService {
    List<Bean> getAllBeans();
    Bean getBeanById(Long id);
    Bean saveBean(Bean bean);
    String deleteBean(Long id);
    Bean updateBean(Long id , Bean bean);
    Long countBeans();
}
