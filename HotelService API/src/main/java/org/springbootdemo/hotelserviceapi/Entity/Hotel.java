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
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @ManyToOne
    private City city;

    @ManyToOne
    @JoinColumn(name = "country_id",referencedColumnName = "id")
    private Country country;

    private String description;

    private double latitude;
    private double longitude;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<HotelReview> review;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<RoomRate> roomRate;
}
