package com.company;
import java.util.Random;

/**
 * This class object stores the joke question information, and
 * handles the graphical output to the console.
 *
 * @author Connor Thomson
 */
public class JokeQuestion extends Question {

    private String joke;
    private String punch_line;
    private int answer;

    public JokeQuestion() {
        String joke = "";
        String punch_line = "";
        int answer = 0;
    }

    public JokeQuestion(Random r) {

        int joke_selector = r.nextInt(4);

        switch (joke_selector) {
            default:
                joke = "Q: How many psychiatrists does it take to change a light bulb?";
                punch_line = "A: None–the light bulb will change when it's ready.";
                answer = 0;
                break;
            case 1:
                joke = "Q: How many flies does it take to screw in a lightbulb?";
                punch_line = "A: Two, but don't ask me how they got in there.";
                answer = 2;
                break;
            case 2:
                joke = "Q: How many Iranians does it take to change a light bulb?";
                punch_line = "A: You send us the prize money and we'll tell you the answer.";
                answer = 0;
                break;
            case 3:
                joke = "Q: How many Irishmen does it take to change a light bulb??";
                punch_line = "A: Three—one to hold the light bulb and two to turn the ladder.";
                answer = 3;
                break;
            case 4:
                joke = "Q: How many Irishmen does it take to change a light bulb??";
                punch_line = "A: Three—one to hold the light bulb and two to turn the ladder.";
                answer = 3;
                break;


        }


    }
    /**
     * Prints the question to the System console.
     */
    public void showQuestion() {
        System.out.println(joke);
    }

    /**
     * Checks to see if an answer is correct and prints the joke punchline.
     * @param response the answer entered by the player
     * @return true if response matches the correct answer
     */
    public Boolean checkAnswer(int response) {
        System.out.println(punch_line);
        if(response==answer) {
            System.out.println("Correct!");
            return true;
        }else {
            System.out.println("Incorrect!");
            return false;
        }

    }



}
