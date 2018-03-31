package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    /**
     * Button functions for Team A.
     */


    public void addGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    public void addFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA (foulTeamA);
    }

    /**
     * Button functions for Team A.
     */

    public void addGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    public void addFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB (foulTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }


    public void displayFoulTeamA(int score) {
        TextView foulView = findViewById(R.id.penaltyA);
        foulView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }


    public void displayFoulTeamB(int score) {
        TextView foulView = findViewById(R.id.penaltyB);
        foulView.setText(String.valueOf(score));
    }

    /**
     * Resets both teams buttons and displays.
     */

    public void resetScore (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamA (foulTeamA);
        displayFoulTeamB (foulTeamB);
    }


}
