package com.assignment.munroamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A class that represents the navigation menu
 *
 * Users can use this page to navigate through the activities in MunRoamer
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_layout);

    }

    /**
     * A method to redirect user to the Map activity
     * @param view the view
     */
    public void ClickMap(View view){
        Intent intent = new Intent(Menu.this,Map_Activity.class);
        startActivity(intent);
    }

    /**
     * A method to redirect user to the About activity
     * @param view the view
     */
    public void ClickAbout(View view){
        Intent intent = new Intent(Menu.this,About.class);
        startActivity(intent);
    }

    /**
     * A method to redirect user to the Before You Roam activity
     * @param view the view
     */
    public void ClickBeforeRoam(View view){
        Intent intent = new Intent(Menu.this,BeforeRoam.class);
        startActivity(intent);
    }

    /**
     * A method to redirect user to the Map activity
     * @param view the view
     */
    public void ClickMyBag(View view){
        Intent intent = new Intent(Menu.this,MyBag.class);
        startActivity(intent);
    }

    /**
     * A method to allow the user to go back to previous activity
     * @param view the view
     */
    public void ClickBack(View view){

        finish();
    }

    /**
     * A method to allow the user to log out
     * @param view the view
     */
    public void ClickLogOut(View view){

        Intent intent = new Intent(Menu.this,Logged_Out.class);
        startActivity(intent);
    }
    /**
     * A method to allow the user to log out
     * @param view the view
     */
    public void ClickAddBag(View view){

        Intent intent = new Intent(Menu.this,NewBagEntry.class);
        startActivity(intent);
    }
    /**
     * A method to allow the user to log out
     * @param view the view
     */
    public void ClickMunroList(View view){

        Intent intent = new Intent(Menu.this,Munro_List.class);
        startActivity(intent);
    }
}
