package com.company;

public class HighScore {

    private int highscore;

    public HighScore() {
        highscore = 0;
    }

    //method that checks the score
    public void recordScore(int score) {
        if(score > highscore) {
            System.out.println("Congrats! Your new high score is " + score);
            highscore = score;
        }else{
            System.out.println("Your current high score is " + score);
        }
    }

    public void showHighScore() {
        System.out.println("High Score: " + highscore);
    }

    public int getHighScore() {
        return highscore;
    }
}
