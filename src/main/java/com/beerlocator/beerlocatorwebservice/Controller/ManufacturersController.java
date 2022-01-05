package com.beerlocator.beerlocatorwebservice.Controller;

import com.beerlocator.beerlocatorwebservice.Model.Manufacturers;
import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Service.ManufacturersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ManufacturersController {

    @Autowired
    ManufacturersService manufacturersSer;

    @GetMapping("/manufacturers")
    public List<Manufacturers> getAll(){ return manufacturersSer.getAll(); }

    @GetMapping("/manufacturers/{id}")
    public Manufacturers getById(@PathVariable int id){ return manufacturersSer.getById(id); }
}
