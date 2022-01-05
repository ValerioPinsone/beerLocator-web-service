package com.beerlocator.beerlocatorwebservice.Controller;

import com.beerlocator.beerlocatorwebservice.Model.Countries;
import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CountriesController {
    @Autowired
    CountriesService countriesSer;

    @GetMapping("/countries")
    public List<Countries> getAll(){ return countriesSer.getAll(); }

    @GetMapping("/countries/{id}")
    public Countries getById(@PathVariable int id){ return countriesSer.getById(id); }

}
