package com.beerlocator.beerlocatorwebservice.Repository;

import com.beerlocator.beerlocatorwebservice.Model.Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesRepository extends JpaRepository<Types, Integer> {
}
