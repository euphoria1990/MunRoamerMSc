package com.assignment.munroamer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * A class that represents the "New Account" screen for MunRoamer
 *
 * Users can use this page to register their details to sign up for an account with MunRoamer
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class  New_Account extends Activity {

    DatabaseHelper db;
    EditText eT1, eT2, eT3, eT4, eT5;
    Button sgnUpBtn,cancBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_account);


        db = new DatabaseHelper(this);
        eT1 = (EditText)findViewById(R.id.newFirstName);
        eT2 = (EditText)findViewById(R.id.newLastName);
        eT3 = (EditText)findViewById(R.id.newEmail);
        eT4 = (EditText)findViewById(R.id.newPassword1);
        eT5 = (EditText)findViewById(R.id.newPassword2);

        sgnUpBtn = (Button)findViewById(R.id.signMeUpBtn);
        cancBtn = (Button)findViewById(R.id.signUpCancBtn);



        sgnUpBtn.setOnClickListener(new View.OnClickListener() {
            /**
             * A method to click Sign Up button and add users details to the database
             * @param v the onClickListener View
             */
            @Override
            public void onClick(View v) {
                String firstNam1 = eT1.getText().toString();
                String lastNam2 = eT2.getText().toString();
                String eMl3 = eT3.getText().toString();
                String newPass4 = eT4.getText().toString();
                String confPass5 = eT5.getText().toString();

                //check if user has entered all required fields
                if (firstNam1.equals("")|| lastNam2.equals("")|| eMl3.equals("")|| newPass4.equals("")|| confPass5.equals("")){
                    Toast.makeText(getApplicationContext(), "Please complete all fields", Toast.LENGTH_LONG).show();
                }
                else{
                    // check if passwords entered match.
                    // If passwords match and the email does not already exist in database - register user.
                    // If passwords entered do not match or email entered already exists - inform user of error

                    if (newPass4.equals(confPass5)){
                        Boolean emailChk = db.emailChk(eMl3);
                        if (emailChk == true){
                            Boolean insert = db.insert(firstNam1,lastNam2, eMl3, newPass4);
                            if (insert ==true){
                                cancBtn.setText("Go to Log In");
                                Toast.makeText(getApplicationContext(), "You have registered as a MunRoamie!!", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"This email has already been registered, try logging in", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        if(!newPass4.equals(confPass5)){
                            Toast.makeText(getApplicationContext(),"Passwords entered do not match", Toast.LENGTH_LONG).show();
                        }
                    }
                }

            }
        });


        cancBtn.setOnClickListener(new View.OnClickListener() {
            /**
             * A method to allow users to click the cancel button and return to the login page
             * @param v OnClickListener View
             */
            @Override
            public void onClick(View v) {
                Intent i = new Intent(New_Account.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
