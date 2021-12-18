package com.ugurhmz.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;       // Kullanıcıdan veriyi al
    EditText number2Text;       // Kullanıcıdan veriyi al
    TextView calculateResult;       // Ekrana basmak

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        calculateResult = findViewById(R.id.calculateResult);

    }



    public void sum(View view) {

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            calculateResult.setText("Enter Number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            calculateResult.setText("Result : "+result);
        }
    }

    public void subtraction(View view) {

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            calculateResult.setText("Enter Number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            calculateResult.setText("Result : " + result);
        }
    }

    public void divide(View view) {

         int numberTwo = Integer.parseInt(number2Text.getText().toString());
         if(numberTwo == 0){
             calculateResult.setText("2.sayı 0 olamaz!");
             return;
         }





        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            calculateResult.setText("Enter Number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;
            calculateResult.setText("Result : "+result);
        }
    }

    public void multiply(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            calculateResult.setText("Enter Number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            calculateResult.setText("Result : "+result);
        }
    }

}