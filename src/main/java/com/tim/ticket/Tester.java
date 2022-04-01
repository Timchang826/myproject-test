package com.tim.ticket;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Ticket.TAIPEI_STATION,Ticket.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You start station? (1.Taipei , 2.Taichung , 3.Kaohsiung");
        int choice = Integer.parseInt(scanner.next());
        Station begin = null;
        switch (choice){
            case 1:
                begin = Station.TAIPEI_STATION;
                break;
            case 2:
                begin = Station.TAICHUNG_STATION;
                break;
            case 3:
                begin = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Your end station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
        int choice1 = Integer.parseInt(scanner.next());
        Station end = null;
        switch (choice1){
            case 1:
                end = Station.TAIPEI_STATION;
                break;
            case 2:
                end = Station.TAICHUNG_STATION;
                break;
            case 3:
                end = Station.KAOHSIUNG_STATION;
                break;
        }
    }
}
