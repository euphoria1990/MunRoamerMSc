package com.assignment.munroamer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/**
 * A class that represents the "Before You Roam" screen for MunRoamer
 *
 * Users can use this page to view brief advice to prepare for hikes
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class BeforeRoam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.before_roam_layout);

        /**
         * Constructor for objects of class BeforeRoam
         */
        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);


    }
}
