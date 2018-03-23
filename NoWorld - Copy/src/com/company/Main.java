package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import com.company.Question;

/**
 * This class handles the game functionality and can play a single game or can play multiple games.
 *
 * @author Connor Thomson
 */
public class Main {

    //private int score = 0;
    private static HighScore highScore;

    public static final int NUMBER_OF_QUESTIONS = 9;

    /**
     * Starts a multi-game session.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {

        Main main = new Main();
        highScore = new HighScore();

        main.playMultipleGames();

    }

    /**
     * Initiates several games, recording the highest score from all.
     */
    public void playMultipleGames() {


        for (int i=0; i<5; i++) {
            playGame();
            System.out.println("Do you want to play again? (Y/N)");
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            if (answer.toUpperCase().contains("N")){
                break;
            }

        }



    }

    /**
     * Initiates and plays a single game
     */
    public void playGame() {

        Random rand = new Random(); //this is to randomise things
        Scanner input = new Scanner(System.in); //this allows for input

        ArrayList<Question> questions = new ArrayList<Question>();


        //add the questions, and a bonus extra joke question.
        for(int i=0;i<NUMBER_OF_QUESTIONS;i++) {
            questions.add(new Question(rand));
        }
        questions.add(new JokeQuestion(rand));
        Collections.shuffle(questions);

        //int Response;
        //int correct;
        int response;
        int calc;
        int x;

        int score = 0;

        //loop 2
        for(int i=0;i<questions.size();i++) {
            questions.get(i).showQuestion();
            response = input.nextInt();

            if (!questions.get(i).checkAnswer(response)) {
                questions.add(questions.get(i));
            }
        }

        //Account for the joke question by subtracting one.
        int questions_incorrect = questions.size() - (NUMBER_OF_QUESTIONS + 1);

        score = (NUMBER_OF_QUESTIONS + 1) - questions_incorrect;

        if(score < 0) score = 0;

        //  0..4:  some message that encourages them to do some more practice to improve, like "Good start.  Can you practice to improve your score?"
        //	5-7:  another success plus encouragement message.
        //	8-10: a congratulations message.

        System.out.println("You got " + score + " right and " + questions_incorrect + " wrong.");

        highScore.recordScore(score);

        //account for the joke question
        System.out.println("Total Questions: " + (NUMBER_OF_QUESTIONS + 1));

           if(score <= 4){
               System.out.println("Try again. You need to improve.");

           }else if(score < 8){
               System.out.println("Very good but room for improvement.");

           }else {
               System.out.println("Great score. Well done.");
           }

        //highScore.showHighScore();

    }


}








