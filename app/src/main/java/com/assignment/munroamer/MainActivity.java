package com.assignment.munroamer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
/**
 * A class that represents the "Login" screen for MunRoamer
 *
 * Users can use this page to log in to MunRoamer or be redirected to create a new account
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class MainActivity extends AppCompatActivity {

    EditText eMl1, passW1;
    Button lgn1;
    TextView sgnUp;
    DatabaseHelper db;


    private static final String TAG = "MainActivity";
    private static final int ERROR_DIALOG_REQUEST = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Constructor for objects of class MainActivity
         */
        db = new DatabaseHelper(this);
        eMl1 = (EditText)findViewById(R.id.emailLogin);
        passW1 = (EditText)findViewById(R.id.loginPasswordText);
        lgn1 = (Button)findViewById(R.id.loginButton);

        sgnUp = (TextView)findViewById(R.id.signUpText);


        /**
         * A method to allow user to login, it will check if the email and passwords match and if they do they can log on
         * Users will be prompted if their details to not match the database
         *
         * @param v the onClickListener View
         */
        lgn1.setOnClickListener(new View.OnClickListener() {

            //logging in process, check if email and passwords match
            @Override
            public void onClick(View v) {
                String email = eMl1.getText().toString();
                String password = passW1.getText().toString();
                Boolean chkEmailPass = db.emlPassCheck(email, password);
                if (chkEmailPass == true && isServicesOK()){
                    Intent intent = new Intent(MainActivity.this,Map_Activity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Incorrect email or password.  Please try again", Toast.LENGTH_LONG).show();
                }
            }
        });


        sgnUp.setOnClickListener(new View.OnClickListener() {
            /**
             * A method to allow a user to click and be redirected to the sign up details page
             * @param v the onclickListener View
             */
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,New_Account.class);
                startActivity(intent);
            }
        });


    }

    /**
     * A method to check if the Google Play Services is available.working for the user
     * @return result of check
     */
    public boolean isServicesOK(){
        Log.d(TAG, "isServicesOK: checking google services version");

        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MainActivity.this);

        if(available == ConnectionResult.SUCCESS) {
            //everything is ok and user can make map requests
            Log.d(TAG, "isServicesOK: Google  Play Services is working");
            return true;
        }
        else if (GoogleApiAvailability.getInstance().isUserResolvableError(available)) {
            //an error occurred but it can be resolved
            Log.d(TAG, "isServicesOK: an error occured but we can fix this");
            //take error that was thrown and Google will show a dialog where we can find a solution to that problem
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this, available, ERROR_DIALOG_REQUEST);
            dialog.show();
        }
        else{
            Toast.makeText(this, "You can't make map requests", Toast.LENGTH_LONG).show();
        }
        return false;

    }

}







