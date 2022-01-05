package com.beerlocator.beerlocatorwebservice.Model;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Countries {

    @Id
    @Column(name="country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer country_id;

    @Column(name="country_name")
    private String country_name;

    @Column(name="country_short_name")
    private String country_short_name;

    //Getter & Setter


    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_short_name() {
        return country_short_name;
    }

    public void setCountry_short_name(String country_short_name) {
        this.country_short_name = country_short_name;
    }
}
