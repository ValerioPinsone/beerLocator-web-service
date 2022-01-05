package com.beerlocator.beerlocatorwebservice.Repository;

import com.beerlocator.beerlocatorwebservice.Model.Manufacturers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturersRepository extends JpaRepository<Manufacturers,Integer> {
}
