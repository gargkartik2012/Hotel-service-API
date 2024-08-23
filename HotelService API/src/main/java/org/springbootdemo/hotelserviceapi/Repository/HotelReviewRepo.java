package org.springbootdemo.hotelserviceapi.Repository;

import org.springbootdemo.hotelserviceapi.Entity.HotelReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelReviewRepo extends JpaRepository<HotelReview,Long> {
}
