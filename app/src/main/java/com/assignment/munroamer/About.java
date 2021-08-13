package com.assignment.munroamer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A class that represents the "About" screen for MunRoamer
 *
 * Users can use this page to view brief information about the app
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_munroamer);

        /**
         * Constructor for objects of class About.
         */

        TextView abtTitleWindow = (TextView) findViewById(R.id.help_titleWindow);
        TextView abtMessageWindow = (TextView) findViewById(R.id.help_messageWindow);


    }
}
