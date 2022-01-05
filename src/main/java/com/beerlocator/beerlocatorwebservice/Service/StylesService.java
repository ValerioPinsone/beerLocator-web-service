package com.beerlocator.beerlocatorwebservice.Service;

import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Repository.StylesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StylesService {

    @Autowired
    StylesRepository stylesRep;

    public List<Styles> getAll(){ return stylesRep.findAll(); }

    public Styles getById(int id){ return stylesRep.findById(id).orElse(new Styles());}

    public void insert(Styles s){ stylesRep.save(s); }

    public void insertAll(List<Styles> ls){ stylesRep.saveAll(ls); }
}
