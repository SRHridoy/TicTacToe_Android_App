package com.elitcoder.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class player_option_activity extends AppCompatActivity {

    private Button btn2players,btn3players;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_option);

        btn2players = findViewById(R.id.btn2players);
        btn3players = findViewById(R.id.btn3platers);

        btn2players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to main activity :
                Intent for2playersActivity;
                for2playersActivity = new Intent(player_option_activity.this, for2playersGrid.class);
                startActivity(for2playersActivity);
            }
        });
        btn3players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent for3playersActivity;
                for3playersActivity = new Intent(player_option_activity.this, for3playersGrid.class);
                startActivity(for3playersActivity);
            }
        });

    }
}