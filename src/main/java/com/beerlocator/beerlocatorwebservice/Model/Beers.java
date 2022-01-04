package com.beerlocator.beerlocatorwebservice.Model;

import javax.persistence.*;

@Entity
@Table(name="beers")
public class Beers {

    @Id
    @Column(name="beer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer beer_id;

    @Column(name="beer_name")
    private String beer_name;

    @Column(name="beer_type_id")
    private Integer beer_type_id;

    @Column(name="beer_color_srm")
    private Integer beer_color_srm;

    @Column(name="beer_info")
    private String beer_info;

    @Column(name="beer_manufacturer_id")
    private Integer beer_manufacturer_id;

    @Column(name="beer_alcol")
    private Float beer_alcol;

    @Column(name="beer_ibu")
    private Integer beer_ibu;

    @Column(name="beer_ean_code")
    private String beer_ean_code;


    //Getter & Setter

    public Integer getBeer_id() {
        return beer_id;
    }

    public void setBeer_id(Integer beer_id) {
        this.beer_id = beer_id;
    }

    public String getBeer_name() {
        return beer_name;
    }

    public void setBeer_name(String beer_name) {
        this.beer_name = beer_name;
    }

    public Integer getBeer_type_id() {
        return beer_type_id;
    }

    public void setBeer_type_id(Integer beer_type_id) {
        this.beer_type_id = beer_type_id;
    }

    public Integer getBeer_color_srm() {
        return beer_color_srm;
    }

    public void setBeer_color_srm(Integer beer_color_srm) {
        this.beer_color_srm = beer_color_srm;
    }

    public String getBeer_info() {
        return beer_info;
    }

    public void setBeer_info(String beer_info) {
        this.beer_info = beer_info;
    }

    public Integer getBeer_manufacturer_id() {
        return beer_manufacturer_id;
    }

    public void setBeer_manufacturer_id(Integer beer_manufacturer_id) {
        this.beer_manufacturer_id = beer_manufacturer_id;
    }

    public Float getBeer_alcol() {
        return beer_alcol;
    }

    public void setBeer_alcol(Float beer_alcol) {
        this.beer_alcol = beer_alcol;
    }

    public Integer getBeer_ibu() {
        return beer_ibu;
    }

    public void setBeer_ibu(Integer beer_ibu) {
        this.beer_ibu = beer_ibu;
    }

    public String getBeer_ean_code() {
        return beer_ean_code;
    }

    public void setBeer_ean_code(String beer_ean_code) {
        this.beer_ean_code = beer_ean_code;
    }
}
