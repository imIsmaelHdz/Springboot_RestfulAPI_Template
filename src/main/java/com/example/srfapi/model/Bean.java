package com.example.srfapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
@Table
public class Bean {
    @Column //defining id as primary key
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private Integer field;
    @Column
    private String extraField;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Integer getField() {return field;}
    public void setField(Integer field) {this.field = field;}
    public String getExtraField() {return extraField;}
    public void setExtraField(String extraField) {this.extraField = extraField;}
}
