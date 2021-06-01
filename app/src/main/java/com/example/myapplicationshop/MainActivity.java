package com.example.myapplicationshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inemail, inpassword;
    private Button button;
    private TextView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inemail =(EditText) findViewById(R.id.editTextTextPersonName);
        EditText inpassword=(EditText)findViewById(R.id.editTextTextPassword);
        TextView btn =(TextView)findViewById(R.id.textView2);
        button=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Regiester.class));

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(MainActivity.this , MainHome.class);
        startActivity(intent);

    }
   private void LoginUser(){
        String email =inemail.getText().toString();
        String pass1= inpassword.getText().toString();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please write your email", Toast.LENGTH_SHORT).show();

        }
        else if(TextUtils.isEmpty(pass1)){
            Toast.makeText(this, "Please write yourmpassword", Toast.LENGTH_SHORT).show();
        }

   }
}