package com.tim.ticket;

public class Station {
    public static final Station TAIPEI_STATION =
            new Station(100,"Taipei");
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
}
