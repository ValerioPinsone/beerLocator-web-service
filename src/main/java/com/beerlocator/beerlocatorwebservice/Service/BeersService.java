package com.beerlocator.beerlocatorwebservice.Service;

import com.beerlocator.beerlocatorwebservice.Model.Beers;
import com.beerlocator.beerlocatorwebservice.Repository.BeersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeersService {
    @Autowired
    BeersRepository beersRep;

    public List<Beers> getAll(){
        return beersRep.findAll();
    }

    public Beers getById(int id){
        return beersRep.findById(id).orElse(new Beers());
    }

    public void insert(Beers b){
        beersRep.save(b);
    }

    public void insertAll(List<Beers> lb){
        beersRep.saveAll(lb);
    }
}
