package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void score3TeamA(View view){
    scoreTeamA= scoreTeamA + 3;
    displayScoreTeamA(scoreTeamA);
    }
    public void score2TeamA(View view){
        scoreTeamA= scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
    }
    public void score1TeamA(View view){
        scoreTeamA= scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }
    public void score3TeamB(View view){
        scoreTeamB= scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void score2TeamB(View view){
        scoreTeamB= scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
    }
    public void score1TeamB(View view){
        scoreTeamB= scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }
    public void resetScore(View view){
        scoreTeamA= 0;
        scoreTeamB= 0;
        displayScoreTeamB(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
public void displayScoreTeamA(int score){

    TextView scoreView = (TextView) findViewById(R.id.team_a_score);
    scoreView.setText(String.valueOf(score));
}
    public void displayScoreTeamB(int score){

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
