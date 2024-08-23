package org.springbootdemo.hotelserviceapi.Repository;


import org.springbootdemo.hotelserviceapi.Entity.CheckOutSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckOutSessionRepo extends JpaRepository<CheckOutSession,Long> {
}
