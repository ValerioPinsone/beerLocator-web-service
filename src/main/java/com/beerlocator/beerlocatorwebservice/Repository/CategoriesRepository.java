package com.beerlocator.beerlocatorwebservice.Repository;

import com.beerlocator.beerlocatorwebservice.Model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
}
