package com.java;
import java.util.*;
import java.io.*;
public class Guessing_Number {
    public int answer, guess;   // stores actual and guess number

    void Random_Number() {
        final int MAX = 10;// maximum value is 10
        Scanner in = new Scanner(System.in);// takes input using scanner
        Random rand = new Random();// Random instance// Random instance
        boolean correct = false;// correct answer
        answer = rand.nextInt(MAX) + 1;
        while (!correct) {
            System.out.println("Guess a number between 1 and 10: ");
            guess = in.nextInt();// guess value
            if (guess > answer)// if guess is greater than actual
                System.out.println("Too high, try again");
            else if (guess < answer)  // if guess is less than actual
                System.out.println("Too low, try again");
            else {// guess is equal to actual value
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }
        }
    }

    public void fileCreation() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println(" Message = RandomNumberFile is not Created ");
        }
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Guessed number is....." + guess);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
    }
}



