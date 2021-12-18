package com.ugurhmz.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


  public void onClick(View view) {
        ImageView myview = findViewById(R.id.imageView);
        myview.setImageResource(R.drawable.haggard2);
  }
}