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
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String code;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;
}
