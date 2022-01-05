package com.beerlocator.beerlocatorwebservice.Service;

import com.beerlocator.beerlocatorwebservice.Model.Countries;
import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesService {
    @Autowired
    CountriesRepository countriesRep;

    public List<Countries> getAll(){ return countriesRep.findAll(); }

    public Countries getById(int id){ return countriesRep.findById(id).orElse(new Countries());}

    public void insert(Countries c){ countriesRep.save(c); }

    public void insertAll(List<Countries> lc){ countriesRep.saveAll(lc); }

}
