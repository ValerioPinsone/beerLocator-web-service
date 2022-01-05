package com.beerlocator.beerlocatorwebservice.Controller;

import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Service.StylesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StylesController {
    @Autowired
    StylesService stylesSer;

    @GetMapping("/styles")
    public List<Styles> getAll(){ return stylesSer.getAll(); }

    @GetMapping("/styles/{id}")
    public Styles getById(@PathVariable int id){ return stylesSer.getById(id); }
}
