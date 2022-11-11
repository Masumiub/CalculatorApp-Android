package com.masum.supersimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum;
    private EditText secondNum;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText)findViewById(R.id.firstNum);
        secondNum = (EditText)findViewById(R.id.secondNum);
        result = (TextView)findViewById(R.id.result);
    }

    public void btnsum(View view) {
        float num1 = Float.parseFloat(firstNum.getText().toString());
        float num2 = Float.parseFloat(secondNum.getText().toString());
        float sum = num1+num2;
        String s = Float.toString(sum);
        if(s.endsWith(".0")){
            s = s.replace(".0", "");
        }
        result.setText(String.valueOf(s));
    }

    public void btnsub(View view) {
        float num1 = Float.parseFloat(firstNum.getText().toString());
        float num2 = Float.parseFloat(secondNum.getText().toString());
        float sub = num1-num2;
        String s = Float.toString(sub);
        if(s.endsWith(".0")){
            s = s.replace(".0", "");
        }
        result.setText(String.valueOf(s));
    }

    public void btnmulti(View view) {
        float num1 = Float.parseFloat(firstNum.getText().toString());
        float num2 = Float.parseFloat(secondNum.getText().toString());

        float mul = num1 * num2;
        String s = Float.toString(mul);
        if(s.endsWith(".0")){
            s = s.replace(".0", "");
        }
        result.setText(String.valueOf(s));

    }

    public void btndiv(View view) {
        float num1 = Float.parseFloat(firstNum.getText().toString());
        float num2 = Float.parseFloat(secondNum.getText().toString());

        try{
            float div = num1/num2;
            result.setText(String.valueOf(div));
        }
        catch (java.lang.ArithmeticException e){
            result.setText("Infinity");
        }

    }

    public void btnAC(View view) {
        result.setText("0");
        firstNum.setText("");
        secondNum.setText("");
    }

    public void btnans(View view) {
        firstNum.setText(result.getText().toString());
        secondNum.setText("");
    }
}