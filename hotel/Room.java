package com.hotel;

import java.util.ArrayList;
import java.util.Iterator;

public class Room implements Hotel {
    int bed_type;
    String room_type;
    int price;
    Room(){}
    Room(int bed_type, String room_type, int price){
        this.bed_type = bed_type;
        this.room_type = room_type;
        this.price = price;
    }
    @Override
    public void quotePrice() {
        Room h1 = new Room(2,"nonac",550);
        Room h2 = new Room(2,"ac",1000);
        Room h3 = new Room(3,"nonac",800);
        Room h4 = new Room(3,"ac",1200);
        Room h5 = new Room(6,"nonac",1500);

        ArrayList<Room> a = new ArrayList<Room>();
        a.add(h1);
        a.add(h2);
        a.add(h3);
        a.add(h4);
        a.add(h5);
        Iterator itr = a.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Room st = (Room)itr.next();
            String l1 = st.room_type;
            String  l2 = "nonac";
            //System.out.println(st.bed_type+" "+st.room_type+" "+st.price);
            if(st.bed_type == 2) {
                int result = l1.compareTo(l2);
                if(result == 0) {
                    System.out.println("2 BED NON AC cost-"+st.price+" Rs");
                }
                else
                    System.out.println("2 BED AC COST-"+st.price+" Rs");


            }else if(st.bed_type == 3){

                int result = l1.compareTo(l2);
                if(result == 0) {
                    System.out.println("3 BED NON AC COST-"+st.price+" Rs");
                }
                else
                    System.out.println("3 BED AC COST-"+st.price+" Rs");

            }
            else {
                System.out.println("6 BED BIG ROOM-"+st.price+" Rs"); }
        }
    }

}
