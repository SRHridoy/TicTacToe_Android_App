package com.elitcoder.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestartActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restart);

        Button btnRestart;
        btnRestart = findViewById(R.id.btnRestart);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameAgain;
                gameAgain = new Intent(RestartActivity2.this, for3playersGrid.class);
                startActivity(gameAgain);
            }
        });


    }
}