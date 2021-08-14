package com.assignment.munroamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A class that represents the "Logged Out" screen for MunRoamer
 *
 * Users can use this page to be confirmed they have logged out and return to the log in activity
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class Logged_Out extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_out_layout);
    }

    /**
     * A method to take the user back to the log in activity
     * @param v the view
     */
    public void ClickRoamAgain (View v){
        Intent intent = new Intent(Logged_Out.this,MainActivity.class);
        startActivity(intent);
    }
}

