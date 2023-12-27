package com.elitcoder.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView;
        imageView = findViewById(R.id.imageView);

        //Parallel threding/asynchronus threding:
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Splash screen making:
                Intent iHome;
                iHome = new Intent(Splash.this,player_option_activity.class);
                startActivity(iHome);
            }
        },3000);

        //Adding animation :
        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.iconscale);
        imageView.startAnimation(scale);

    }
}