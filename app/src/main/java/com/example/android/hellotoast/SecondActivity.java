package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView ShowCount = (TextView) findViewById(R.id.ShowNum);
        Intent mIntent= getIntent();
        int mCount = mIntent.getIntExtra("ShowCount", 0);
        ShowCount.setText(Integer.toString(mCount));
    }
}