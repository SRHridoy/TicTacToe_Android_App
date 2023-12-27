package com.elitcoder.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class for3playersGrid extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    int currentPlayerIndex = 0;
    int count = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for3players_grid);

        //init() method banassi karon ekhane id rakhbo ar encapsulate or sundor korar jonne alada function bannssi:
        init();
        //Onekgulabutton same kaj tai ekta alada vabe onclick method banabo ar xml e diye dibo seta :


    }
    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
    }

    public void check(View v) {
        Button btnCurrent = (Button) v;
        String[] players = {"X", "O", "Y"};

        if (btnCurrent.getText().toString().equals("")) {
            count++;
            Log.w("count :", String.valueOf(count));
            btnCurrent.setText(players[currentPlayerIndex]);

            // Toggle to the next player
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }

        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();
            b10= btn10.getText().toString();
            b11 = btn11.getText().toString();
            b12 = btn12.getText().toString();
            b13 = btn13.getText().toString();
            b14 = btn14.getText().toString();
            b15 = btn15.getText().toString();
            b15 = btn15.getText().toString();

            //Conditions to win :
            // Assuming b1, b2, ..., b16 are variables representing the cells
// Each cell can be marked by Player 1 ("X"), Player 2 ("O"), or Player 3 ("Y")

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_LONG).show();
                delayStart();
            } else if(b2.equals(b3) && b3.equals(b4) && !b2.equals("")){
                Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_LONG).show();
                delayStart();
            } else if(b5.equals(b6) && b6.equals(b7) && !b5.equals("")){
                Toast.makeText(this, "Winner is : " + b5, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b6.equals(b7) && b7.equals(b8) && !b6.equals("")){
                Toast.makeText(this, "Winner is : " + b6, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b9.equals(b10) && b10.equals(b11) && !b9.equals("")){
                Toast.makeText(this, "Winner is : " + b9, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b11.equals(b12) && b10.equals(b11) && !b11.equals("")){
                Toast.makeText(this, "Winner is : " + b11, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b13.equals(b14) && b14.equals(b15) && !b13.equals("")){
                Toast.makeText(this, "Winner is : " + b13, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b14.equals(b15) && b15.equals(b16) && !b14.equals("")){
                Toast.makeText(this, "Winner is : " + b14, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b5.equals(b9) && b9.equals(b13) && !b5.equals("")){
                Toast.makeText(this, "Winner is : " + b5, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b2.equals(b6) && b6.equals(b10) && !b2.equals("")){
                Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b6.equals(b10) && b10.equals(b14) && !b6.equals("")){
                Toast.makeText(this, "Winner is : " + b6, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b3.equals(b7) && b7.equals(b11) && !b3.equals("")){
                Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b7.equals(b11) && b11.equals(b15) && !b7.equals("")){
                Toast.makeText(this, "Winner is : " + b7, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b4.equals(b8) && b8.equals(b12) && !b4.equals("")){
                Toast.makeText(this, "Winner is : " + b4, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b8.equals(b12) && b12.equals(b16) && !b8.equals("")){
                Toast.makeText(this, "Winner is : " + b8, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b1.equals(b6) && b6.equals(b11) && !b1.equals("")){
                Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b11.equals(b16) && b6.equals(b11) && !b6.equals("")){
                Toast.makeText(this, "Winner is : " + b6, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b4.equals(b7) && b7.equals(b10) && !b4.equals("")){
                Toast.makeText(this, "Winner is : " + b4, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b10.equals(b13) && b7.equals(b10) && !b7.equals("")){
                Toast.makeText(this, "Winner is : " + b7, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                Toast.makeText(this, "Winner is : " + b3, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b2.equals(b7) && b7.equals(b12) && !b2.equals("")){
                Toast.makeText(this, "Winner is : " + b2, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b5.equals(b10) && b10.equals(b15) && !b5.equals("")){
                Toast.makeText(this, "Winner is : " + b5, Toast.LENGTH_LONG).show();
                delayStart();
            }else if(b8.equals(b11) && b11.equals(b14) && !b8.equals("")){
                Toast.makeText(this, "Winner is : " + b8, Toast.LENGTH_LONG).show();
                delayStart();
            }
            else if (count == 16) {
                Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show();
                delayStart();
            }

        }
    }

    // New game logic:
    public void newGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn13.setText("");
        btn14.setText("");
        btn15.setText("");
        btn16.setText("");

        count = 0;
        currentPlayerIndex = 0;
    }
    //Delay method for new game :
    public void delayStart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                newGame();
                restart();
            }
        },2000);
    }
    //getting data:

    //Restart activity:
    public void restart(){
        Intent restart;
        restart = new Intent(for3playersGrid.this,RestartActivity2.class);
        startActivity(restart);
    }

}