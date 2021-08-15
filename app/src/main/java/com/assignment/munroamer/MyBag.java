package com.assignment.munroamer;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * A class that represents the Database the users Munro Bag entries
 *
 * Users can use this page to view the diary entries of the Munros they have bagged
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class MyBag extends AppCompatActivity {


    BagDatabaseHelper myBagDb;
    Button bagMunro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_bag_layout);

        bagMunro = (Button)findViewById(R.id.bagMunrosBtn);

        ListView listView = (ListView) findViewById(R.id.myBagList);
        myBagDb = new BagDatabaseHelper(this);

        ArrayList<String> theList = new ArrayList<>();
        Cursor data = myBagDb.getListContents();

        if(data.getCount() == 0){
            Toast.makeText(MyBag.this, "Your Munro Bag is empty :(", Toast.LENGTH_LONG).show();
        }
        else{
            while(data.moveToNext()){
                theList.add(data.getString(1));
                theList.add(data.getString(2));
                theList.add(data.getString(3));

                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,theList);
                listView.setAdapter(listAdapter);
            }
        }

        /**
         * A method to allow the user to go the the NewBagEntry activity so they can bag more munros
         */
        bagMunro.setOnClickListener(new View.OnClickListener() {
            /**
             * a method to take the user to the activity New Bag Entry to add Munros to their bag
             * @param v the view
             */
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBag.this, NewBagEntry.class);
                startActivity(intent);
            }
        });






        //Navigation tool bar
        TextView title = (TextView) findViewById(R.id.toolbarTitle);
        title.setText("My Bag");
    }







    //Menu icon

    /**
     * A method to take the user to the navigation menu
     * @param v the view
     */
    public void ClickMenu4 (View v){
        Intent intent = new Intent(MyBag.this,Menu.class);
        startActivity(intent);
    }
}
