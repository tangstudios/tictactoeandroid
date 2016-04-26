package com.example.wilson.tic_tac_toe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Wilson on 4/1/2015.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_layout);
    }

    public void onOnePlayerClick(View view) {
        Intent toOnePlayerScreen = new Intent(this, OnePlayerScreen.class);
        startActivity(toOnePlayerScreen);
    }

    public void onTwoPlayerClick(View view) {
        Intent toTwoPlayerScreen = new Intent(this, TwoPlayerScreen.class);
        startActivity(toTwoPlayerScreen);
    }
}
