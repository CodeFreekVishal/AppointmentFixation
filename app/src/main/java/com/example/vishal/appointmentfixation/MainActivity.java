package com.example.vishal.appointmentfixation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public RadioGroup rgroup;
    public RadioButton rbLow, rbMedium, rbHigh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbLow = (RadioButton) findViewById(R.id.rbLow);
        rbMedium = (RadioButton) findViewById(R.id.rbMedium);
        rbHigh = (RadioButton) findViewById(R.id.rbHigh);


    }


}
