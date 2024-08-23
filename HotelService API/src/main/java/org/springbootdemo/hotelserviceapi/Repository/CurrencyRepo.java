package org.springbootdemo.hotelserviceapi.Repository;

import org.springbootdemo.hotelserviceapi.Entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency,Long> {
}
