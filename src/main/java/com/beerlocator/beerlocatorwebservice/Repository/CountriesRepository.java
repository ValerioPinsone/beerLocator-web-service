package com.beerlocator.beerlocatorwebservice.Repository;

import com.beerlocator.beerlocatorwebservice.Model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries,Integer> {
}
