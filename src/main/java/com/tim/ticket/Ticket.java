package com.tim.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    int start,end;
    public Ticket(int start,int end){
        this.start=start;
        this.end=end;
    }
}
