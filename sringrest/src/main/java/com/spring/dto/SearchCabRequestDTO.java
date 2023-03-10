package com.spring.dto;

import com.spring.entities.Location;
import com.spring.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCabRequestDTO {
    User user;

    Location start;
    Location end;

}
