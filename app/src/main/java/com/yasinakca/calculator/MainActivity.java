package com.yasinakca.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstText;
    EditText secondText;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstText = findViewById(R.id.firstText);
        secondText = findViewById(R.id.secondText);
        resultText = findViewById(R.id.resultText);
    }

    public void sumClicked(View view) {

        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")) {
            resultText.setText("Error");
        }else {

            int num1 = Integer.parseInt(firstText.getText().toString());
            int num2 = Integer.parseInt(secondText.getText().toString());
            int result = num1 + num2;

            resultText.setText("Result: " + result);
        }
    }

    public void deductClicked(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")) {
            resultText.setText("Error");
        }else {

            int num1 = Integer.parseInt(firstText.getText().toString());
            int num2 = Integer.parseInt(secondText.getText().toString());

            int result = num1 - num2;

            resultText.setText("Result: " + result);
        }
    }

    public void multiplyClicked(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")) {
            firstText.setText("Error");
        }else {

            int num1 = Integer.parseInt(firstText.getText().toString());
            int num2 = Integer.parseInt(secondText.getText().toString());

            int result = num1 * num2;

            resultText.setText("Result: " + result);
        }
    }

    public void divideClicked(View view) {
        if (firstText.getText().toString().matches("") || secondText.getText().toString().matches("")) {
            resultText.setText("Error");
        }else {

            int num1 = Integer.parseInt(firstText.getText().toString());
            int num2 = Integer.parseInt(secondText.getText().toString());

            int result = num1 / num2;

            resultText.setText("Result: " + result);
        }
    }

}
