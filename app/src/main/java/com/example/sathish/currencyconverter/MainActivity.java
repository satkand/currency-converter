package com.example.sathish.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void CurrencyConvert(View view){


        EditText audText = (EditText) findViewById(R.id.audText);

        //Converting to srting

        String p = audText.getText().toString();

        //converting to double

        Double v= Double.parseDouble(p);

        //Multiplying the value

        Double s = v*51.08;

        String j = String.format("%.2f", s);

        Log.i("Info",j);



        Toast.makeText(this, "AUD $"+p+" is: " + j +"INR", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
