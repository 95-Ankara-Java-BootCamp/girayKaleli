package com.week3.ödev;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PegasusReservationSystem  extends FlightReservationSystem{

    @Override
    public void rezarvasyonAl() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Please enter seats number : ");
        setSeatsNumber(scanner.nextInt());
        setKoltuk(new boolean[getSeatsNumber()]);
        setBusinessSeat(random.nextInt(10)); //x;


        HashMap<Integer, Boolean> seats = new HashMap<>(getSeatsNumber());

        randomSeatAllocation(getKoltuk(), getSeatsNumber(), seats);

        super.rezarvasyonAl();
    }
}
