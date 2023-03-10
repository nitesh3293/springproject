package com.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripDetails {

    Driver currentDriver ;
    User currentUser ;
    private int id;
}
