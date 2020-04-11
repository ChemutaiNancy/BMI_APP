package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    Button btnCalculateBMI;
    EditText etWeight, etHeight;
    TextView txtDisplayBMI, txtDisplayResult;
    double height = 0;
    double weight = 0;
    double bmi = 0;
    String message = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnCalculateBMI = findViewById(R.id.btnCalculate);
        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        txtDisplayBMI = findViewById(R.id.txtDisplayBMI);
        txtDisplayResult = findViewById(R.id.txtDisplayResults);
        btnCalculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight = Double.parseDouble(etWeight.getText().toString());
                height = Double.parseDouble(etHeight.getText().toString());
                bmi = height * height;
                bmi = weight/bmi;

                txtDisplayBMI.setText(String.valueOf(bmi));

                if (bmi < 18.5){
                    message = "Underweight";
                } else if (bmi > 18.5 && bmi < 26){
                    message = "Normal";
                } else if (bmi > 26){
                    message = "Overweight";
                }

                txtDisplayResult.setText(message);
            }
        });
    }
}
