package com.example.tmp_sda_1124.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void convert(View view)
    {
        //View text = findViewById(R.id.input_value_from_user):
        EditText textArea = (EditText) findViewById(R.id.input_value_from_user);
        String res = textArea.getText().toString();
        double value = 0;
        try
        {
            value = Double.parseDouble(res);
        }
        catch(NumberFormatException ex)
        {
            Toast toast = Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
       // double value = Double.parseDouble(res);
        double result =0;
        if(view.getId() == R.id.convert_g_2_kg)
        {
            result = value/1000;
        }
        else
        {
            result = value * 1000;
        }

        NumberFormat formatter = new DecimalFormat("#0.00");
        String toDisplay = formatter.format(result);

        Toast toast = Toast.makeText(this, toDisplay, Toast.LENGTH_SHORT);
        toast.show();
    }



    public void calculatefeet(View view) {
        EditText input = (EditText) findViewById(R.id.edit_meter);
        int i = Integer.parseInt(String.valueOf(input.getText()));

        double convert=i*3.28084;
        String message = String.valueOf(convert);
        //Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();

        EditText output = (EditText) findViewById(R.id.edit_result);
        output.setText(message);
    }
    public void calculateinches(View view) {
        EditText input = (EditText) findViewById(R.id.edit_meter);
        int i = Integer.parseInt(String.valueOf(input.getText()));

        double convert=i*3.28084*12;
        String message = String.valueOf(convert);
        //Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();

        EditText output = (EditText) findViewById(R.id.edit_result);
        output.setText(message);
    }
    public void calculateyard(View view) {
        EditText input = (EditText) findViewById(R.id.edit_meter);
        int i = Integer.parseInt(String.valueOf(input.getText()));

        double convert=(i*3.28084)/3;
        String message = String.valueOf(convert);
        //Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();

        EditText output = (EditText) findViewById(R.id.edit_result);
        output.setText(message);
    }
}
