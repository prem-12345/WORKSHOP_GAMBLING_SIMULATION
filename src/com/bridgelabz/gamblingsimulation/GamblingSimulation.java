package com.bridgelabz.gamblingsimulation;

import java.util.Random;

public class GamblingSimulation {

    //WELCOME TO GAMBLING SIMULATION PROGRAM

    //UC1 TAKING STAKE AS 100 AND BET AS 1

    public static final int STAKE = 100;
    public static final int BET = 1;

    public static void winOrLoss() {

        //UC2 CHECK WIN OR LOSS

        Random random = new Random();
        int Num = random.nextInt(2);
        if (Num == 1) {
            System.out.println(" GAMBLER WIN ");

        } else {
            System.out.println(" GAMBLER LOSS ");

        }
    }

    public static void main(String[] args) {
        GamblingSimulation.winOrLoss();
    }
}
