package com.beerlocator.beerlocatorwebservice.Controller;

import com.beerlocator.beerlocatorwebservice.Model.Categories;
import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CategoriesController {
    @Autowired
    CategoriesService categoriesSer;

    @GetMapping("/categories")
    public List<Categories> getAll(){ return categoriesSer.getAll(); }

    @GetMapping("/categories/{id}")
    public Categories getById(@PathVariable int id){ return categoriesSer.getById(id); }
}
