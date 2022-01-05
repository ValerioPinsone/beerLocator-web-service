package com.beerlocator.beerlocatorwebservice.Service;

import com.beerlocator.beerlocatorwebservice.Model.Manufacturers;
import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Repository.ManufacturersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturersService {
    @Autowired
    ManufacturersRepository manufacturersRep;

    public List<Manufacturers> getAll(){ return manufacturersRep.findAll(); }

    public Manufacturers getById(int id){ return manufacturersRep.findById(id).orElse(new Manufacturers());}

    public void insert(Manufacturers m){ manufacturersRep.save(m); }

    public void insertAll(List<Manufacturers> lm){ manufacturersRep.saveAll(lm); }
}
