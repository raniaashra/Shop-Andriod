package com.example.myapplicationshop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Regiester extends AppCompatActivity {
    private EditText username, email, password, re_password;
    private Button btnSignin;
    private TextView mtextview;
    private ProgressBar loadBar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editTextTextPersonName2);
        email = (EditText) findViewById(R.id.editTextTextPassword3);
        password = (EditText) findViewById(R.id.editTextTextPassword2);
        re_password = (EditText) findViewById(R.id.editTextTextPassword3);
        btnSignin = (Button) findViewById(R.id.button2);
        mtextview = (TextView) findViewById(R.id.textView);
        loadBar = new ProgressBar(this);

        mtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Regiester.this, MainActivity.class));

            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccount();

            }
        });
    }

    public void CreateAccount() {
        String user = username.getText().toString().trim();
        String emai = email.getText().toString().trim();
        String pass = password.getText().toString().trim();
        if (TextUtils.isEmpty(user)) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        }
        if (TextUtils.isEmpty(emai)) {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();

        }
        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();

        }
        if (password.length() < 6) {
            Toast.makeText(this, "Please enter your password again", Toast.LENGTH_SHORT).show();

        }



    }

}






