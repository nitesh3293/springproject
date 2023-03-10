package com.spring.repo;

import com.spring.entities.SearchRequestCab;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookingRepo {

    List<SearchRequestCab> searchRequestCabList;

    public BookingRepo() {
        searchRequestCabList = new ArrayList<>();
    }
    public List<SearchRequestCab> getBookings(){
        // TODO Auto-generated method stub
        return searchRequestCabList;
    }

    public void deleteBooking(long id){
        // TODO Auto-generated method stub
        searchRequestCabList = searchRequestCabList.stream()
                .filter(x -> x.getId() != id).collect(Collectors.toList());
    }
}
