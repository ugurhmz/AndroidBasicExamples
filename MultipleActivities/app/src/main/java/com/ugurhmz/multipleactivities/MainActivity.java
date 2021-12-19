package com.ugurhmz.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;  // input oluştur
    String userName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText); // inputu id'si ile bul.
        userName = "";
    }


    public void changeActivity(View view){

        userName = editText.getText().toString();   // inputtan gelen veriyi al

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("userInput", userName);     // inputa K,V şeklinde yollaki, diğer activity'de kullan.
        startActivity(intent);
    }



}