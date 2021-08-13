package com.assignment.munroamer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_munroamer);

        TextView abtTitleWindow = (TextView) findViewById(R.id.help_titleWindow);
        TextView abtMessageWindow = (TextView) findViewById(R.id.help_messageWindow);


    }
}
