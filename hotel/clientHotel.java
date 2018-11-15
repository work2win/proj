package com.hotel;

public class clientHotel {
    public static void main(String args[]){
        nonACRoom non1 = new nonACRoom(2,"FirstFloor-NONAC",1000);
        nonACRoom non2 = new nonACRoom(6,"FirstFloor-NONAC",1000);
        CompositeHotel comp = new CompositeHotel();
        comp.addBed(non1);
        comp.addBed(non2);

        acRoom ac1 = new acRoom(2,"FirstFloor-AC",2000);
        acRoom ac2 = new acRoom(3,"FirstFloor-AC",2000);
        CompositeHotel accomp = new CompositeHotel();
        accomp.addBed(ac1);
        accomp.addBed(ac2);

        CompositeHotel comphot = new CompositeHotel();
        comphot.addBed(comp);
        comphot.addBed(accomp);
        comphot.quotePrice();

    }
}
