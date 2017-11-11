package com.sean.guess.guessv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r = new Random().nextInt(10)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send (View view){
        EditText number = (EditText) findViewById(R.id.ed_num);
        TextView message  = findViewById(R.id.text_m);

        int n = Integer.parseInt(number.getText().toString());

        if(n>r){
            message.setText("小一點");
        }else if(n<r){
            message.setText("大一點");
        }else if(n ==r){
            message.setText("答對拉!!");
        }
    }



}
