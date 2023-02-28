package com.example.srfapi.controller;

import com.example.srfapi.model.Bean;
import com.example.srfapi.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeanController {
    @Autowired
    BeanService beanService;

    @PostMapping("/bean")
    public Bean saveBean(@RequestBody Bean bean){
        return beanService.saveBean(bean);}

    @GetMapping("/bean/{id}")
    public Bean getBean(@PathVariable("id") Long id){ return beanService.getBeanById(id);}
}
