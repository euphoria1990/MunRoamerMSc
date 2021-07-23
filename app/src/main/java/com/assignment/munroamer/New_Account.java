package com.assignment.munroamer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class New_Account extends Activity {

    DatabaseHelper db;
    EditText eT1, eT2, eT3, eT4, eT5;
    Button sgnUpBtn;

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
        sgnUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = eT1.getText().toString();
                String str2 = eT2.getText().toString();
                String str3 = eT3.getText().toString();
                String str4 = eT4.getText().toString();
                String str5 = eT5.getText().toString();

                //check if user has entered all required fields
                if (str1.equals("")|| str2.equals("")|| str3.equals("")|| str4.equals("")|| str5.equals("")){
                    Toast.makeText(getApplicationContext(), "Please complete all fields", Toast.LENGTH_LONG).show();
                }
                else{
                    // check if passwords entered match.
                    // //If passwords match and the email does not already exist in database - register user.
                    // //If passwords entered do not match or email entered already exists - inform user of error

                    if (str4.equals(str5)){
                        Boolean emailChk = db.emailChk(str3);
                        if (emailChk == true){
                            Boolean insert = db.insert(str3, str4);
                            if (insert ==true){
                                Toast.makeText(getApplicationContext(), "You have registered as a MunRoamie!!", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"This email has already been registered, try logging in", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        if(!str4.equals(str5)){
                            Toast.makeText(getApplicationContext(),"Passwords entered do not match", Toast.LENGTH_LONG).show();
                        }
                    }
                }

            }
        });

        //this.setTitle("New Account");
    }
}

