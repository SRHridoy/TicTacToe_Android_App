package com.elitcoder.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Parallel threding/asynchronus threding:
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Splash screen making:
                Intent iHome;
                iHome = new Intent(Splash.this,MainActivity.class);
                startActivity(iHome);
            }
        },4000);

    }
}