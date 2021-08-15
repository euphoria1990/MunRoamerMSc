package com.assignment.munroamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A class that represents the "New Bag Entry" screen for MunRoamer
 *
 * Users can use this page to add new diary entries regarding their ascents to their 'Bag'
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class NewBagEntry extends AppCompatActivity {

    BagDatabaseHelper myBagDb;
    EditText bDate, bName, bDiary;
    Button addToBag,cancBagBtn,goToBagbtn, addAgain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_my_bag);

        //Navigation tool bar
        TextView title = (TextView) findViewById(R.id.toolbarTitle);
        title.setText("Add to My Bag");


        myBagDb = new BagDatabaseHelper(this);
        bDate = (EditText) findViewById(R.id.bagDate);
        bName = (EditText) findViewById(R.id.bagMunroName);
        bDiary = (EditText) findViewById(R.id.bagDiaryEntry);

        addToBag = (Button) findViewById(R.id.addToBag);
        cancBagBtn = (Button) findViewById(R.id.cancelBag);
        goToBagbtn = (Button) findViewById(R.id.goToBag);
        addAgain = (Button) findViewById(R.id.addAnother);


        /**
         * A method to allow the user to click the Add To Bag button to add their entries to their bag
         */
        addToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newDate = bDate.getText().toString();
                String newMName = bName.getText().toString();
                String newDiary = bDiary.getText().toString();

                if (bDate.length() != 0 || bName.length() != 0 || bDiary.length() != 0) {
                    AddData(newDate, newMName, newDiary);
                    bDate.setText("");
                    bName.setText("");
                    bDiary.setText("");
                } else {
                    Toast.makeText(NewBagEntry.this, "Please use all text fields", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    /**
     * A method to add data to the database/users Munro bag
     * @param newDate the date
     * @param newMName the name of munro
     * @param newDiary the diary entry
     */
    public void AddData(String newDate, String newMName, String newDiary)
    {
        boolean insertData = myBagDb.addData(newDate, newMName, newDiary);
        if (insertData==true){
            addToBag.setVisibility(View.INVISIBLE);
            cancBagBtn.setVisibility(View.INVISIBLE);
            goToBagbtn.setVisibility(View.VISIBLE);
            addAgain.setVisibility(View.VISIBLE);
            Toast.makeText(NewBagEntry.this, "Woohoo you have bagged a Munro!", Toast.LENGTH_LONG).show();
    }
        else{
            Toast.makeText(NewBagEntry.this, "Something went wrong, please try again", Toast.LENGTH_LONG).show();
        }

        goToBagbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewBagEntry.this, MyBag.class);
                startActivity(intent);
            }
        });





        cancBagBtn.setOnClickListener(new View.OnClickListener() {
            /**
             * A method to allow users to click the cancel button and return to the My Bag page
             * @param v OnClickListener View
             */
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewBagEntry.this, MyBag.class);
                startActivity(i);
            }
        });

        goToBagbtn.setOnClickListener(new View.OnClickListener() {
            /**
             * A method to allow users to go and view My Bag page
             * @param v OnClickListener View
             */
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewBagEntry.this, MyBag.class);
                startActivity(i);
            }
        });

        addAgain.setOnClickListener(new View.OnClickListener() {
            /**
             * A method to allow users to add another entry to their bag
             * @param v OnClickListener View
             */
            @Override
            public void onClick(View v) {
                addToBag.setVisibility(View.VISIBLE);
                cancBagBtn.setVisibility(View.VISIBLE);
                goToBagbtn.setVisibility(View.INVISIBLE);
                addAgain.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(), "MunRoamer is ready to bag another Munro", Toast.LENGTH_LONG).show();

            }
        });

    }






    //Menu icon

    /**
     * A method to take the user to the navigation menu
     * @param v the view
     */
    public void ClickMenu3 (View v){
        Intent intent = new Intent(NewBagEntry.this,Menu.class);
        startActivity(intent);
    }
}





