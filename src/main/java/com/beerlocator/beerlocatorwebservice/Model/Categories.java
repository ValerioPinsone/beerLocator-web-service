package com.beerlocator.beerlocatorwebservice.Model;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class Categories {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;

    @Column(name="category_name")
    private String category_name;

    @Column(name="category_info")
    private String category_info;

    //Getter & Setter


    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_info() {
        return category_info;
    }

    public void setCategory_info(String category_info) {
        this.category_info = category_info;
    }
}
