package com.example.android.sportcounter;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class KickerActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kicker);
        displayForTeamA(0);

    }

    public void minusScoreA(View v) {
        if (scoreTeamA == 0){
            Toast.makeText(this, "You cannot go under 0", Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(2);
        if (scoreTeamA > 0) {
            scoreTeamA = scoreTeamA -1;
        }
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        displayForTeamA(1);
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    public void resetScore(View v) {
        if (scoreTeamA + scoreTeamB == 0) {
            Toast.makeText(this, "You already reset the score", Toast.LENGTH_SHORT).show();
        }
        scoreTeamA = 0;
        scoreTeamB = 0;
         displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v) {
        displayForTeamB(3);
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    public void minusScoreB(View v) {
        if (scoreTeamB == 0) {
            Toast.makeText(this, "You cannot go under 0", Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(2);
        if (scoreTeamB > 0) {
            scoreTeamB = scoreTeamB -1;
        }
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        displayForTeamB(1);
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
