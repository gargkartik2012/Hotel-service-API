package org.springbootdemo.hotelserviceapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id",referencedColumnName = "id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
    private String comment;
    private int rating;
    private LocalDate reviewDate;
}
