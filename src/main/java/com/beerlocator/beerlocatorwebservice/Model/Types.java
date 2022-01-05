package com.beerlocator.beerlocatorwebservice.Model;

import javax.persistence.*;

@Entity
@Table(name="types")
public class Types {

    @Id
    @Column(name="type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer type_id;

    @Column(name="type_name")
    private String type_name;

    @Column(name="type_info")
    private String type_info;

    @Column(name="type_category_id")
    private Integer type_style_id;

    //Getter & Setter


    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_info() {
        return type_info;
    }

    public void setType_info(String type_info) {
        this.type_info = type_info;
    }

    public Integer getType_style_id() {
        return type_style_id;
    }

    public void setType_style_id(Integer type_style_id) {
        this.type_style_id = type_style_id;
    }
}
