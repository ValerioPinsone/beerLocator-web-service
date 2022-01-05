package com.beerlocator.beerlocatorwebservice.Repository;

import com.beerlocator.beerlocatorwebservice.Model.Styles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StylesRepository extends JpaRepository<Styles,Integer> {
}
