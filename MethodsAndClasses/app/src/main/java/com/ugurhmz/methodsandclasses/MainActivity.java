package com.ugurhmz.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate() loaded");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause() called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop() called");
    }




}