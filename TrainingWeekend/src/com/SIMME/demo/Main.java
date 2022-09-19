package com.SIMME.demo;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player pOne = new Player();
        Player pTwo = new Player();
        Dice dice = new Dice();



        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Player 1 name");
        pOne.playerOne = scan.next();

        System.out.println("Welcome " + pOne.playerOne);

        System.out.println("Player 2 name ");
        pTwo.playerTwo = scan.next();

        System.out.println("Welcome " + pTwo.playerTwo);

        System.out.println("Round 1");


        System.out.println(pOne.playerOne);
dice.pOneRoundOne = rand.nextInt(6) + 1;
        System.out.println(dice.pOneRoundOne);

        System.out.println(pTwo.playerTwo);
        dice.pTwoRoundOne = rand.nextInt(6) + 1;
        System.out.println(dice.pTwoRoundOne);

        System.out.println("Round 2");  // Round 1

        System.out.println(pOne.playerOne);
        dice.pOneRoundTwo = rand.nextInt(6) + 1;
        System.out.println(dice.pOneRoundTwo);


        System.out.println(pTwo.playerTwo);
        dice.pTwoRoundTwo = rand.nextInt(6) + 1;
        System.out.println(dice.pTwoRoundTwo);

        int totalScorePlayerOne = dice.pOneRoundOne + dice.pOneRoundTwo;
        int totalScorePlayerTwo = dice.pTwoRoundOne + dice.pTwoRoundTwo;
        System.out.println(pOne.playerOne + "Total score: " + totalScorePlayerOne);
        System.out.println(pTwo.playerTwo + "total score: " + totalScorePlayerTwo);










    }
}