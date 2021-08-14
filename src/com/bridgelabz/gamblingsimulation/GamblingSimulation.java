package com.bridgelabz.gamblingsimulation;

import java.util.Random;

public class GamblingSimulation {

    //WELCOME TO GAMBLING SIMULATION PROGRAM

    //UC1 TAKING STAKE AS 100 AND BET AS 1

    public static final int STAKE = 100;
    public static final int BET = 1;
    public static int winningAmount, looseAmount, stake;

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

    public static int stakeResign() {

        //UC3 GAMBLER PLAYES FOR 50% IF WIN OR LOSS

        float stake_value = 0.5f;
        stake = STAKE;
        winningAmount = (int) Math.round(STAKE + (STAKE * stake_value));
        looseAmount = (int) Math.round(STAKE * stake_value);
        boolean Flag = true;

        while (Flag) {

            winOrLoss();
            if (stake == winningAmount) {
                Flag = false;
            }
            if (stake == looseAmount) {
                Flag = false;
            }

        }

        return stake;


    }

    public static void main(String[] args) {
        GamblingSimulation stakeresign = new GamblingSimulation();
        System.out.println(GamblingSimulation.stakeResign());
    }
}
