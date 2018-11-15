package com.hotel;

public class acRoom implements Hotel {

    int bed_type;
    String room_type;
    int price;

    public acRoom(int bed_type, String room_type, int price){
        this.bed_type = bed_type;
        this.room_type = room_type;
        this.price = price;
    }

    @Override
    public void quotePrice() {
        System.out.println("for your room "+room_type+ " with bed count "+bed_type+" price is..  "+price);
    }
}
