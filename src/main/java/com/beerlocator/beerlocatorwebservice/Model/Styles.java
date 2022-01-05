package com.beerlocator.beerlocatorwebservice.Model;

import javax.persistence.*;

@Entity
@Table(name="styles")
public class Styles {

    @Id
    @Column(name="style_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer style_id;

    @Column(name="style_name")
    private String style_name;

    @Column(name="style_info")
    private String style_info;

    @Column(name="style_category_id")
    private Integer style_category_id;


    //Getter & Setter


    public Integer getStyle_id() {
        return style_id;
    }

    public void setStyle_id(Integer style_id) {
        this.style_id = style_id;
    }

    public String getStyle_name() {
        return style_name;
    }

    public void setStyle_name(String style_name) {
        this.style_name = style_name;
    }

    public String getStyle_info() {
        return style_info;
    }

    public void setStyle_info(String style_info) {
        this.style_info = style_info;
    }

    public Integer getStyle_category_id() {
        return style_category_id;
    }

    public void setStyle_category_id(Integer style_category_id) {
        this.style_category_id = style_category_id;
    }
}
