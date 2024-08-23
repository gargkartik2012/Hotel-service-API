package org.springbootdemo.hotelserviceapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    private String roomType;

    private double pricePerNight;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;
    private int availableRooms;


}
