package com.example.ricindigus.futbolcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtGoalsA;
    TextView txtGoalsB;
    TextView txtFoulsA;
    TextView txtFoulsB;
    TextView txtCornersA;
    TextView txtCornersB;
    TextView txtYellowCardsA;
    TextView txtYellowCardsB;
    TextView txtRedCardsA;
    TextView txtRedCardsB;

    int goalsA = 0;
    int goalsB = 0;
    int foulsA = 0;
    int foulsB = 0;
    int cornersA = 0;
    int cornersB = 0;
    int yellowCardsA = 0;
    int yellowCardsB = 0;
    int redCardsA = 0;
    int redCardsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conectarVistas();
    }

    public void agregarGoalTeamA(View v) {
        goalsA++;
        displayGoalsTeamA(goalsA);
    }

    private void displayGoalsTeamA(int goals) {
        txtGoalsA.setText(String.valueOf(goals));
    }

    public void agregarGoalTeamB(View v) {
        goalsB++;
        displayGoalsTeamB(goalsB);
    }

    private void displayGoalsTeamB(int goals) {
        txtGoalsB.setText(String.valueOf(goals));
    }

    public void agregarFoulsTeamA(View v) {
        foulsA++;
        displayFoulsTeamA(foulsA);
    }

    private void displayFoulsTeamA(int fouls) {
        txtFoulsA.setText(String.valueOf(fouls));
    }

    public void agregarFoulsTeamB(View v) {
        foulsB++;
        displayFoulsTeamB(foulsB);
    }

    private void displayFoulsTeamB(int fouls) {
        txtFoulsB.setText(String.valueOf(fouls));
    }

    public void agregarCornersTeamA(View v) {
        cornersA++;
        displayCornersTeamA(cornersA);
    }

    private void displayCornersTeamA(int corners) {
        txtCornersA.setText(String.valueOf(corners));
    }

    public void agregarCornersTeamB(View v) {
        cornersB++;
        displayCornersTeamB(cornersB);
    }

    private void displayCornersTeamB(int corners) {
        txtCornersB.setText(String.valueOf(corners));
    }

    public void agregarYellowCardsTeamA(View v) {
        yellowCardsA++;
        displayYellowCardsTeamA(yellowCardsA);
    }

    private void displayYellowCardsTeamA(int yellowCards) {
        txtYellowCardsA.setText(String.valueOf(yellowCards));
    }

    public void agregarYellowCardsTeamB(View v) {
        yellowCardsB++;
        displayYellowCardsTeamB(yellowCardsB);
    }

    private void displayYellowCardsTeamB(int yellowCards) {
        txtYellowCardsB.setText(String.valueOf(yellowCards));
    }

    public void agregarRedCardsTeamA(View v) {
        redCardsA++;
        displayRedCardsTeamA(redCardsA);
    }

    private void displayRedCardsTeamA(int redCards) {
        txtRedCardsA.setText(String.valueOf(redCards));
    }

    public void agregarRedCardsTeamB(View v) {
        redCardsB++;
        displayRedCardsTeamB(redCardsB);
    }

    private void displayRedCardsTeamB(int redCards) {
        txtRedCardsB.setText(String.valueOf(redCards));
    }

    public void restoreStadistics(View v){
        goalsA = 0;
        goalsB = 0;
        cornersA = 0;
        cornersB = 0;
        foulsA = 0;
        foulsB = 0;
        yellowCardsA = 0;
        yellowCardsB = 0;
        redCardsA = 0;
        redCardsB = 0;

        displayGoalsTeamA(goalsA);
        displayGoalsTeamB(goalsB);
        displayCornersTeamA(cornersA);
        displayCornersTeamB(cornersB);
        displayFoulsTeamA(foulsA);
        displayFoulsTeamB(foulsB);
        displayYellowCardsTeamA(yellowCardsA);
        displayYellowCardsTeamB(yellowCardsB);
        displayRedCardsTeamA(redCardsA);
        displayRedCardsTeamB(redCardsB);

    }


    private void conectarVistas() {
        txtGoalsA = findViewById(R.id.textview_goal_a);
        txtGoalsB = findViewById(R.id.textview_goal_b);

        txtFoulsA = findViewById(R.id.textview_fouls_a);
        txtFoulsB = findViewById(R.id.textview_fouls_b);

        txtCornersA = findViewById(R.id.textview_corners_a);
        txtCornersB = findViewById(R.id.textview_corners_b);

        txtYellowCardsA = findViewById(R.id.textview_yellow_cards_a);
        txtYellowCardsB = findViewById(R.id.textview_yellow_cards_b);

        txtRedCardsA = findViewById(R.id.textview_red_card_a);
        txtRedCardsB = findViewById(R.id.textview_red_card_b);
    }
}
