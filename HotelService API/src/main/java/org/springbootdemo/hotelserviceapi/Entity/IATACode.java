package org.springbootdemo.hotelserviceapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IATACode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String locationName;

    @ManyToOne
    @JoinColumn(name = "city_id",referencedColumnName = "id")
    private City city;

}
