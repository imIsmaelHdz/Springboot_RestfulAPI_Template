package com.example.srfapi.service;

import com.example.srfapi.model.Bean;

import java.util.List;

public interface BeanService {

    List<Bean> getAllBeans();
    Bean getBeanById(Long id);
    Bean saveBean(Bean bean);
    Bean deleteBean(Bean bean);
    Bean updateBwan(Long id , Bean bean);
}
