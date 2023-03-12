package com.spring.dto;

import com.spring.entities.Driver;
import com.spring.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequestDTO {
    Driver driver;
    User user;
    long id = new Random().nextLong();
}
