package com.beerlocator.beerlocatorwebservice.Controller;


import com.beerlocator.beerlocatorwebservice.Model.Types;
import com.beerlocator.beerlocatorwebservice.Service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TypesController {
    @Autowired
    TypesService typesSer;

    @GetMapping("/types")
    public List<Types> getAll(){ return typesSer.getAll(); }

    @GetMapping("/types/{id}")
    public Types getById(@PathVariable int id){ return typesSer.getById(id);}

}
