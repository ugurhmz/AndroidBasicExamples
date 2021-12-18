package com.ugurhmz.storyingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enterAge;
    TextView result;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterAge = findViewById(R.id.age);      // Yaşın id'sini al
        result = findViewById(R.id.resultText); // Resultuun id'si al


        sharedPreferences  = this.getSharedPreferences("com.ugurhmz.storyingdata", Context.MODE_PRIVATE);

        int storedAge = sharedPreferences.getInt("storedAge",0);

        if(storedAge == 0) result.setText("Your age : ");
        else result.setText("Your age : "+ storedAge);




    }

    // save
    public void save(View view) {
        if(!enterAge.getText().toString().matches("")){
            int yourAge = Integer.parseInt(enterAge.getText().toString());
            result.setText("Your Age : "+ yourAge);

            sharedPreferences.edit().putInt("storedAge", yourAge).apply();
        }
    }


    // delete
    public void delete(View view) {
        int storedData = sharedPreferences.getInt("storedAge", 0);

        if(storedData != 0){
            sharedPreferences.edit().remove("storedAge").apply();
            result.setText("Başarıyla silindi...");
        }

    }



}