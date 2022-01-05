package com.beerlocator.beerlocatorwebservice.Model;

import javax.persistence.*;

@Entity
@Table(name="manufacturers")
public class Manufacturers {

    @Id
    @Column(name="manufacturer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer manufacturer_id;

    @Column(name="manufacturer_name")
    private String manufacturer_name;

    @Column(name="manufacturer_country_id")
    private Integer manufacturer_country_id;

    @Column(name="manufacturer_info")
    private String manufacturer_info;

    //Getter & Setter


    public Integer getManufacturer_id() {
        return manufacturer_id;
    }

    public void setManufacturer_id(Integer manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }

    public Integer getManufacturer_country_id() {
        return manufacturer_country_id;
    }

    public void setManufacturer_country_id(Integer manufacturer_country_id) {
        this.manufacturer_country_id = manufacturer_country_id;
    }

    public String getManufacturer_info() {
        return manufacturer_info;
    }

    public void setManufacturer_info(String manufacturer_info) {
        this.manufacturer_info = manufacturer_info;
    }
}
