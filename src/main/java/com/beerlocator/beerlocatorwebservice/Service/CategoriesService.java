package com.beerlocator.beerlocatorwebservice.Service;

import com.beerlocator.beerlocatorwebservice.Model.Categories;
import com.beerlocator.beerlocatorwebservice.Model.Styles;
import com.beerlocator.beerlocatorwebservice.Repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    CategoriesRepository categoriesRep;


    public List<Categories> getAll(){ return categoriesRep.findAll(); }

    public Categories getById(int id){ return categoriesRep.findById(id).orElse(new Categories());}

    public void insert(Categories c){ categoriesRep.save(c); }

    public void insertAll(List<Categories> lc){ categoriesRep.saveAll(lc); }
}
