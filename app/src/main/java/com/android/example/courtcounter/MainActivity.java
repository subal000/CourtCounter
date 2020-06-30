package com.android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePoints(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void twoPoints(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void freeThrow(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    public void threePointsB(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void twoPointsB(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void freeThrowB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
public void reset(View view){
        scoreA=scoreA*0;
        scoreB=scoreB*0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
}
}
