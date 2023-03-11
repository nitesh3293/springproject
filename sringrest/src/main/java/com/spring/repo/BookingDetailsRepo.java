package com.spring.repo;

import com.spring.entities.BookingDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingDetailsRepo {

    List<BookingDetails> bookingDetailsList;
    public BookingDetailsRepo(){
        bookingDetailsList = new ArrayList<>();
    }

    //add booking
    public BookingDetails addBooking( BookingDetails bookingDetails) {
        // TODO Auto-generated method stub
        bookingDetailsList.add(bookingDetails);
        return bookingDetails;
    }

    //show all bookings
    public List<BookingDetails> getBookingDetails() {
        // TODO Auto-generated method stub
        return bookingDetailsList;
    }

    //show specific booking
    public BookingDetails getBookingDetail(long id) {
        // TODO Auto-generated method stub
        BookingDetails u = null;

        for(BookingDetails bookingDetails : bookingDetailsList)
        {
            if(bookingDetails.getId() == id)
            {
                u = bookingDetails;
                break;
            }
        }
        return u;
    }



}
