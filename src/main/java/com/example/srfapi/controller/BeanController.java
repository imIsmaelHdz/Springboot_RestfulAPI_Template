package com.example.srfapi.controller;

import com.example.srfapi.model.Bean;
import com.example.srfapi.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BeanController {
    @Autowired
    BeanService beanService;

    @GetMapping("/beans")
    public List<Bean> getBeans(){ return beanService.getAllBeans();}

    @PostMapping("/bean")
    public Bean saveBean(@RequestBody Bean bean){
        return beanService.saveBean(bean);}

    @GetMapping("/bean/{id}")
    public Bean getBean(@PathVariable("id") Long id){ return beanService.getBeanById(id);}

    @DeleteMapping("/bean/{id}")
    public String deleteBean(@PathVariable("id") Long id){return beanService.deleteBean(id);}

    @GetMapping("/bean/count")
    public Long countBean(){ return beanService.countBeans();}
}
