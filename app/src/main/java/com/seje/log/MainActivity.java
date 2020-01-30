package com.seje.log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username_,password_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username_=findViewById(R.id.username);
        password_=findViewById(R.id.password);
    }
    public void onLogin(View view){

        String user_name=username_.getText().toString();
        String pass_word=password_.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker= new BackgroundWorker(this);
        backgroundWorker.execute(type,user_name,pass_word);
       // startActivity(new Intent(this, Home.class));

    }
    public void onOpenRegActivity(View view){
        startActivity(new Intent(this,Register.class));
    }
}
