package com.beerlocator.beerlocatorwebservice.Service;

import com.beerlocator.beerlocatorwebservice.Model.Types;
import com.beerlocator.beerlocatorwebservice.Repository.TypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypesService {
    @Autowired
    TypesRepository typesRep;

    public List<Types> getAll(){ return typesRep.findAll(); }

    public Types getById(int id){ return typesRep.findById(id).orElse(new Types()); }

    public void insert(Types t){ typesRep.save(t); }

    public void insertAll(List<Types> lt){ typesRep.saveAll(lt); }
}

