package com.example.srfapi.service;

import com.example.srfapi.model.Bean;

import java.util.List;

public interface BeanService {
    Boolean existBean(Long id);
    List<Bean> getAllBeans();
    Bean getBeanById(Long id);
    Bean saveBean(Bean bean);
    Bean updateBean(Long id , Bean bean);
    String deleteBean(Long id);
    Long countBeans();
}
