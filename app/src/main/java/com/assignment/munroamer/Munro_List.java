package com.assignment.munroamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A class that represents the List of Munros in order of height
 *
 * Users can use this page see a list of all the Munros according to their height
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class Munro_List extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.munro_height_info);

        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        TextView title = (TextView) findViewById(R.id.toolbarTitle);

        title.setText("Munro List");
    }





    /**
     * A method to take the user to the navigation menu
     * @param v the view
     */
    public void ClickMenu5 (View v){
        Intent intent = new Intent(Munro_List.this,Menu.class);
        startActivity(intent);
    }
}
