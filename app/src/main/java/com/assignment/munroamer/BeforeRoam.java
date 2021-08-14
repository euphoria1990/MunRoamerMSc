package com.assignment.munroamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        TextView title = (TextView) findViewById(R.id.toolbarTitle);

        title.setText("Before You Roam");


    }


    /**
     * A method to take the user to the navigation menu
     * @param v the view
     */
    public void ClickMenu1 (View v){
        Intent intent = new Intent(BeforeRoam.this,Menu.class);
        startActivity(intent);
    }
}
