package com.assignment.munroamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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


        TextView abtMessageWindow = (TextView) findViewById(R.id.help_messageWindow);

        TextView title = (TextView) findViewById(R.id.toolbarTitle);

        title.setText("About");


    }

    /**
     * A method to take the user to the navigation menu
     * @param v the view
     */
    public void ClickMenu2 (View v){
        Intent intent = new Intent(About.this,Menu.class);
        startActivity(intent);
    }


}
