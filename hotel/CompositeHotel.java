package com.hotel;
import java.util.List;
import java.util.ArrayList;

public class CompositeHotel implements Hotel{
    private List<Hotel> hotelList = new ArrayList<Hotel>();


    @Override
    public void quotePrice() {
        for(Hotel ho:hotelList){
            ho.quotePrice();
        }
    }
    public void addBed(Hotel ho){
        hotelList.add(ho);
    }

    public void removeBed(Hotel ho){
        hotelList.remove(ho);
    }
}
