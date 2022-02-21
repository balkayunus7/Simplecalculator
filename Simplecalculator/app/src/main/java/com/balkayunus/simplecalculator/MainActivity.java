package com.balkayunus.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    EditText edittext2;
    TextView resulttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext=findViewById(R.id.number1text);
        edittext2=findViewById(R.id.number2text);
        resulttext=findViewById(R.id.resulttext);

    }

    public void toplama(View view){

        int number1=Integer.parseInt(edittext.getText().toString());
        int number2=Integer.parseInt(edittext2.getText().toString());
        int result=number1+number2;
        resulttext.setText("sonuc"+result);
    }
    public void cıkarma (View view){
        int number1=Integer.parseInt(edittext.getText().toString());
        int number2=Integer.parseInt(edittext2.getText().toString());
        int result=number1-number2;
        resulttext.setText("sonuc"+result);
    }
    public void carpma(View view){
        int number1=Integer.parseInt(edittext.getText().toString());
        int number2=Integer.parseInt(edittext2.getText().toString());
        int result=number1*number2;
        resulttext.setText("sonuc"+result);
    }
    public void bolme(View view){
        int number1=Integer.parseInt(edittext.getText().toString());
        int number2=Integer.parseInt(edittext2.getText().toString());
        int result=number1/number2;
        resulttext.setText("sonuc"+result);
    }


}