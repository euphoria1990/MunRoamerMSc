package com.assignment.munroamer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class New_Account extends Activity {

    EditText eT1, eT2, eT3, eT4, eT5;
    Button sgnUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_account);
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
            }
        });

        //this.setTitle("New Account");
    }
}

