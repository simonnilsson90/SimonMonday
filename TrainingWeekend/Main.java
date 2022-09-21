package com.SIMME.demo;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player pOne = new Player(); // Tar in klassen Player i Main för stringvariabeln PlayerOne
        Player pTwo = new Player(); // Tar in klassen Player i Main för stringvariabeln PlayerTwo
        Dice dice = new Dice();

        Random random = new Random();  // Använder denna till tärningen som kastas

        Scanner scan = new Scanner(System.in);  // Scanner behövs för att få in namn och antal tärningar


        System.out.println("Player 1 name");
        pOne.playerOne = scan.next(); //Scannar in amnet på player One från Player-klassen

        System.out.println("Welcome " + pOne.playerOne);

        System.out.println("Player 2 name ");
        pTwo.playerTwo = scan.next(); //Scannar in amnet på player Two från Player-klassen

        System.out.println("Welcome " + pTwo.playerTwo);

        System.out.println("How many dice?");
        dice.numberOfDices = scan.nextInt(); // Scannar in antal tärningar


        System.out.println("Round 1");
        System.out.println(pOne.playerOne);

        for (int i = 0; i < dice.numberOfDices; i++) {              //en loop som tar in antal tärningar
            dice.dicePOne = random.nextInt(1, 7);    // Ger ett random nummer mellan 1 och 6
            System.out.println("Score: " + dice.dicePOne);   // printar nummren på tärningen/tärningarna
            pOne.sumPOne += dice.dicePOne;     // Räknar ut tärningarnas totala summa

        }
        System.out.println(pTwo.playerTwo);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePTwo = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePTwo);
            pTwo.sumPTwo += dice.dicePTwo;

        }

        // Här hade jag velat loopa mina "rounds" men det blir lite för rörigt i skallen för tillfället.
        // Så det får bli ett DRY utan dess like :(

        System.out.println("Round 2");
        System.out.println(pOne.playerOne);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePOne = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePOne);
            pOne.sumPOne += dice.dicePOne;
        }

        System.out.println(pTwo.playerTwo);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePTwo = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePTwo);
            pTwo.sumPTwo += dice.dicePTwo;

        }


        System.out.println("Round 3");
        System.out.println(pOne.playerOne);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePOne = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePOne);
            pOne.sumPOne += dice.dicePOne;
        }

        System.out.println(pTwo.playerTwo);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePTwo = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePTwo);
            pTwo.sumPTwo += dice.dicePTwo;

        }

        System.out.println("Round 4");
        System.out.println(pOne.playerOne);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePOne = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePOne);
            pOne.sumPOne += dice.dicePOne;
        }

        System.out.println(pTwo.playerTwo);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePTwo = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePTwo);
            pTwo.sumPTwo += dice.dicePTwo;

        }

        System.out.println("Round 5");
        System.out.println(pOne.playerOne);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePOne = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePOne);
            pOne.sumPOne += dice.dicePOne;
        }

        System.out.println(pTwo.playerTwo);
        for (int i = 0; i < dice.numberOfDices; i++) {
            dice.dicePTwo = random.nextInt(1, 7);
            System.out.println("Score: " + dice.dicePTwo);
            pTwo.sumPTwo += dice.dicePTwo;

        }


          System.out.println("Total score " + pOne.playerOne + ": " + pOne.sumPOne );  // Räknar ut alla summor från ronderna
         System.out.println("Total score " + pTwo.playerTwo + ": " +  pTwo.sumPTwo ); // Räknar ut alla summor från ronderna

        if (pOne.sumPOne >  pTwo.sumPTwo) {  // om summan för player One är mer än summan för player two vinner PlayerOne
            System.out.println("The winner is: " + pOne.playerOne);  // och printas här
        } else if (pOne.sumPOne <  pTwo.sumPTwo) { // om summan för pOne är mindre än summan för pTwo:
            System.out.println("The Winner is: " + pTwo.playerTwo); // printas "The winner is" plus PlayerTwo

        } else {   // Om inte nån poäng är mer än någon annans blir printas "draw".
            System.out.println("Draw");
        }
    }

}



// I övrigt: Enhetstest har jag inte riktigt hunnit med i detta fall.


