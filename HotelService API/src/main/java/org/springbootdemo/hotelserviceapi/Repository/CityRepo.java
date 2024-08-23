package org.springbootdemo.hotelserviceapi.Repository;

import org.springbootdemo.hotelserviceapi.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City,Long> {
}
