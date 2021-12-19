package com.ugurhmz.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myText;
    Runnable runnable;
    Handler handler;
    int number;
    Button startBtn;
    Button stopBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = findViewById(R.id.myText);
        number = 0;
        startBtn = findViewById(R.id.startBtn);
        stopBtn = findViewById(R.id.stopBtn);
    }


    // Start
    public void start(View view) {

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                myText.setText("Time : "+ number);
                number++;
                myText.setText("Time : "+ number);
                handler.postDelayed(runnable, 1000);
            }
        };

        handler.post(runnable);
        startBtn.setEnabled(false);
        stopBtn.setEnabled(true);
    }

    // Stop
    public void stop(View view){
        startBtn.setEnabled(true);
        handler.removeCallbacks(runnable);
        number = 0;
        myText.setText("Time : "+number);
        if(number == 0){
            stopBtn.setEnabled(false);
        }
    }



}