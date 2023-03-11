package com.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetails {

    Driver driver;
    User user;
    private Long id;
    private long startTime;
    private long endTime;

}
//long epoch = System.currentTimeMillis();