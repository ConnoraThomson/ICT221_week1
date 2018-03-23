package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * This class object stores the question information, and
 * handles the graphical output to the console.
 *
 * @author Connor Thomson
 */
public class Question {

    private int value1;
    private int value2;

    //+,-,*,/
    private String operator;
    private int answer;

    public Question() {
        Random r = new Random(); //this is to randomise things
        r.nextInt();
        value1 = r.nextInt(10);
        value2 = r.nextInt(10);

        int plusorminus = r.nextInt(2);

        switch (plusorminus) {
            default:
                //plus
                operator = "+";
                answer = value1 + value2;
                break;
            case 1:
                //minus
                operator = "-";
                answer = value1 - value2;
                break;
        }
    }

    public Question(Random r) {

        r.nextInt();
        value1 = r.nextInt(10);
        value2 = r.nextInt(10);

        int plusorminus = r.nextInt(2);

        switch (plusorminus) {
            default:
                //plus
                operator = "+";
                answer = value1 + value2;
                break;
            case 1:
                //minus
                operator = "-";
                answer = value1 - value2;
                break;
        }


    }

    /**
     * Prints the question to the System console.
    */
    public void showQuestion() {
        System.out.println("What is " + value1 + " " + operator + " " + value2 + "?");
    }

    /**
     * Checks to see if an answer is correct.
     *
     * @param response the answer entered by the player
     * @return true if response is the correct answer.
     */
    public Boolean checkAnswer(int response) {
        if(response==answer) {
            System.out.println("Correct");
            return true;
        }
        System.out.println("Incorrect");
        return false;
    }

}




