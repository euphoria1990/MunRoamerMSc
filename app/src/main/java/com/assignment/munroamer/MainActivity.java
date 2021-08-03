package com.assignment.munroamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eMl1, passW1;
    Button lgn1;
    TextView sgnUp;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);
        eMl1 = (EditText)findViewById(R.id.emailLogin);
        passW1 = (EditText)findViewById(R.id.loginPasswordText);
        lgn1 = (Button)findViewById(R.id.loginButton);

        sgnUp = (TextView)findViewById(R.id.signUpText);

        lgn1.setOnClickListener(new View.OnClickListener() {

            //logging in process, check if email and passwords match
            @Override
            public void onClick(View v) {
                String email = eMl1.getText().toString();
                String password = passW1.getText().toString();
                Boolean chkEmailPass = db.emlPassCheck(email, password);
                if (chkEmailPass == true) {
                    Intent intent = new Intent(MainActivity.this,Map_Page.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Incorrect email or password.  Please try again", Toast.LENGTH_LONG).show();
                }
            }
        });

        sgnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,New_Account.class);
                startActivity(intent);
            }
        });
    }
}