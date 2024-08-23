package org.springbootdemo.hotelserviceapi.Repository;

import org.springbootdemo.hotelserviceapi.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Long> {
}
