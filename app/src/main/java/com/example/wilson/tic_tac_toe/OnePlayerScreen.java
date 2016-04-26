package com.example.wilson.tic_tac_toe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Wilson on 4/1/2015.
 */
public class OnePlayerScreen extends Activity {
    int rand, filter;
    int start = 1;

    int xwins, owins, ties;

    TextView place1, place2, place3, place4, place5, place6, place7, place8, place9,
            xwinsText, tiesText, owinsText, status;
    Button newGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_player_screen_layout);

        status = (TextView) findViewById(R.id.status);
        newGame = (Button) findViewById(R.id.new_game_button);

        place1 = (TextView) findViewById(R.id.place1);
        place2 = (TextView) findViewById(R.id.place2);
        place3 = (TextView) findViewById(R.id.place3);
        place4 = (TextView) findViewById(R.id.place4);
        place5 = (TextView) findViewById(R.id.place5);
        place6 = (TextView) findViewById(R.id.place6);
        place7 = (TextView) findViewById(R.id.place7);
        place8 = (TextView) findViewById(R.id.place8);
        place9 = (TextView) findViewById(R.id.place9);
        xwinsText = (TextView) findViewById(R.id.xwins);
        tiesText = (TextView) findViewById(R.id.ties);
        owinsText = (TextView) findViewById(R.id.owins);
    }

    public void onPlace1Click(View view) {
        if (place1.getText().toString().equals("")) {
            place1.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace2Click(View view) {
        if (place2.getText().toString().equals("")) {
            place2.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace3Click(View view) {
        if (place3.getText().toString().equals("")) {
            place3.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace4Click(View view) {
        if (place4.getText().toString().equals("")) {
            place4.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace5Click(View view) {
        if (place5.getText().toString().equals("")) {
            place5.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace6Click(View view) {
        if (place6.getText().toString().equals("")) {
            place6.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace7Click(View view) {
        if (place7.getText().toString().equals("")) {
            place7.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace8Click(View view) {
        if (place8.getText().toString().equals("")) {
            place8.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onPlace9Click(View view) {
        if (place9.getText().toString().equals("")) {
            place9.setText("X");

            //Check for X 3-in-a-row
            if ((place1.getText().toString().equals("X")) && (place2.getText().toString().equals("X")) && (place3.getText().toString().equals("X")) ||
                    (place4.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) ||
                    (place7.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place4.getText().toString().equals("X")) && (place7.getText().toString().equals("X")) ||
                    (place2.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place8.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place6.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place1.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place9.getText().toString().equals("X")) ||
                    (place3.getText().toString().equals("X")) && (place5.getText().toString().equals("X")) && (place7.getText().toString().equals("X"))
                    ) {
                status.setText("P1 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                xwins++;
                xwinsText.setText("P1 Wins: " + xwins);
            }

            //Random spot for computer
            filter = 0;
            while (filter == 0)
            {
                rand = (int)(Math.random() * 9) + 1;
                if (rand == 1 && place1.getText().toString().equals("")){
                    place1.setText("O");
                    filter = 1;
                }
                else if (rand == 2 && place2.getText().toString().equals("")) {
                    place2.setText("O");
                    filter = 1;
                }
                else if (rand == 3 && place3.getText().toString().equals("")) {
                    place3.setText("O");
                    filter = 1;
                }
                else if (rand == 4 && place4.getText().toString().equals("")) {
                    place4.setText("O");
                    filter = 1;
                }
                else if (rand == 5 && place5.getText().toString().equals("")) {
                    place5.setText("O");
                    filter = 1;
                }
                else if (rand == 6 && place6.getText().toString().equals("")) {
                    place6.setText("O");
                    filter = 1;
                }
                else if (rand == 7 && place7.getText().toString().equals("")) {
                    place7.setText("O");
                    filter = 1;
                }
                else if (rand == 8 && place8.getText().toString().equals("")) {
                    place8.setText("O");
                    filter = 1;
                }
                else if (rand == 9 && place9.getText().toString().equals("")) {
                    place9.setText("O");
                    filter = 1;
                }
            }

            //Check for O 3-in-a-row
            if ((place1.getText().toString().equals("O")) && (place2.getText().toString().equals("O")) && (place3.getText().toString().equals("O")) ||
                    (place4.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) ||
                    (place7.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place4.getText().toString().equals("O")) && (place7.getText().toString().equals("O")) ||
                    (place2.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place8.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place6.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place1.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place9.getText().toString().equals("O")) ||
                    (place3.getText().toString().equals("O")) && (place5.getText().toString().equals("O")) && (place7.getText().toString().equals("O"))
                    ) {
                status.setText("P2 WINS!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);
                owins++;
                owinsText.setText("P2 Wins: " + owins);
            }

            //Check for tie
            if (!place1.getText().toString().equals("") && !place2.getText().toString().equals("") && !place3.getText().toString().equals("") &&
                    !place4.getText().toString().equals("") && !place5.getText().toString().equals("") && !place6.getText().toString().equals("") &&
                    !place7.getText().toString().equals("") && !place8.getText().toString().equals("") && !place9.getText().toString().equals("")) {
                status.setText("TIE!");
                newGame.setVisibility(View.VISIBLE);
                if (place1.getText().toString().equals(""))
                    place1.setVisibility(View.INVISIBLE);
                if (place2.getText().toString().equals(""))
                    place2.setVisibility(View.INVISIBLE);
                if (place3.getText().toString().equals(""))
                    place3.setVisibility(View.INVISIBLE);
                if (place4.getText().toString().equals(""))
                    place4.setVisibility(View.INVISIBLE);
                if (place5.getText().toString().equals(""))
                    place5.setVisibility(View.INVISIBLE);
                if (place6.getText().toString().equals(""))
                    place6.setVisibility(View.INVISIBLE);
                if (place7.getText().toString().equals(""))
                    place7.setVisibility(View.INVISIBLE);
                if (place8.getText().toString().equals(""))
                    place8.setVisibility(View.INVISIBLE);
                if (place9.getText().toString().equals(""))
                    place9.setVisibility(View.INVISIBLE);

                ties++;
                tiesText.setText("Ties: " + ties);
            }
        }
    }

    public void onNewGameClick(View view) {
        place1.setText(""); place2.setText("");place3.setText("");place4.setText("");place5.setText("");place6.setText("");
        place7.setText("");place8.setText("");place9.setText("");

        status.setText("");
        newGame.setVisibility(View.INVISIBLE);
        place1.setVisibility(View.VISIBLE);
        place2.setVisibility(View.VISIBLE);
        place3.setVisibility(View.VISIBLE);
        place4.setVisibility(View.VISIBLE);
        place5.setVisibility(View.VISIBLE);
        place6.setVisibility(View.VISIBLE);
        place7.setVisibility(View.VISIBLE);
        place8.setVisibility(View.VISIBLE);
        place9.setVisibility(View.VISIBLE);

        start++;
        if (start % 2 == 0){
            rand = (int)(Math.random() * 9) + 1;

            if (rand == 1) place1.setText("O");
            else if (rand == 2) place2.setText("O");
            else if (rand == 3) place3.setText("O");
            else if (rand == 4) place4.setText("O");
            else if (rand == 5) place5.setText("O");
            else if (rand == 6) place6.setText("O");
            else if (rand == 7) place7.setText("O");
            else if (rand == 8) place8.setText("O");
            else place9.setText("O");
        }
    }
}
