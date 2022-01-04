package com.beerlocator.beerlocatorwebservice.Controller;

import com.beerlocator.beerlocatorwebservice.Model.Beers;
import com.beerlocator.beerlocatorwebservice.Service.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BeersController {
    @Autowired
    BeersService beersSer;

    @GetMapping("/beers")
    public List<Beers> getAll(){
        return beersSer.getAll();
    }
}
