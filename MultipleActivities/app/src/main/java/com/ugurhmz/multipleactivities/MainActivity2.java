package com.ugurhmz.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewScreen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewScreen2 = findViewById(R.id.textViewScreen2);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userInput");
        textViewScreen2.setText(userName);

    }


    public void changeScreen(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}