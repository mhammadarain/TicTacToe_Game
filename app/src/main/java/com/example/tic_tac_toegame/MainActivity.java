package com.example.tic_tac_toegame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restartbtn;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag = 0;
    int count= 0;

    public void delaynewGame(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                newGame();
            }
        },3000);
    }

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
        btn2.getAnimation();
        count = 0;
        flag = 0;

        btn2.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn1.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn3.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn4.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn5.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn6.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn7.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn8.setBackgroundColor(getResources().getColor(R.color.l_blue));
        btn9.setBackgroundColor(getResources().getColor(R.color.l_blue));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restartbtn = findViewById(R.id.restartbtn);
        init();
    }
    private void init(){

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    public void check(View view){
        Button btnCurrent = (Button) view;
        if(btnCurrent.getText().toString().equals("")) {
            count++;

            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
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

                // conditions

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is : " + b1, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn1.startAnimation(animation);
                    btn2.startAnimation(animation);
                    btn3.startAnimation(animation);

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    //2
                    Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn4.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn6.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn4.startAnimation(animation);
                    btn5.startAnimation(animation);
                    btn6.startAnimation(animation);

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    //3
                    Toast.makeText(this, "Winner is :" + b7, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn7.setBackgroundColor(getResources().getColor(R.color.green));
                    btn8.setBackgroundColor(getResources().getColor(R.color.green));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn7.startAnimation(animation);
                    btn8.startAnimation(animation);
                    btn9.startAnimation(animation);


                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    //4
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    btn4.setBackgroundColor(getResources().getColor(R.color.green));
                    btn7.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn1.startAnimation(animation);
                    btn4.startAnimation(animation);
                    btn7.startAnimation(animation);


                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    //5
                    Toast.makeText(this, "Winner is :" + b2, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn8.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn2.startAnimation(animation);
                    btn5.startAnimation(animation);
                    btn8.startAnimation(animation);

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //6
                    Toast.makeText(this, "winner is: " + b3, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    btn6.setBackgroundColor(getResources().getColor(R.color.green));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn3.startAnimation(animation);
                    btn6.startAnimation(animation);
                    btn9.startAnimation(animation);

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //7
                    Toast.makeText(this, "winner is: " + b1, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn1.startAnimation(animation);
                    btn5.startAnimation(animation);
                    btn9.startAnimation(animation);

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //8
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green));
                    btn7.setBackgroundColor(getResources().getColor(R.color.green));
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
                    btn3.startAnimation(animation);
                    btn5.startAnimation(animation);
                    btn7.startAnimation(animation);

                }else if (!b1.equals("")&& !b2.equals("")&& !b3.equals("")
                        && !b4.equals("")&& !b5.equals("")&& !b6.equals("")
                        && !b7.equals("")&& !b8.equals("")&& !b9.equals("")){
                    Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show();
                    delaynewGame();
                    btn1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn4.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn5.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn6.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn7.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn8.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    btn9.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                }
                restartbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        newGame();
                    }
                });
            }
        }
    }
    @Override
    public void onBackPressed() {


        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setMessage("Exit the Game?");
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                moveTaskToBack(true);
            }
        });
        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }
}