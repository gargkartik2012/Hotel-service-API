package org.springbootdemo.hotelserviceapi.Repository;

import org.springbootdemo.hotelserviceapi.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country,Long> {
}
