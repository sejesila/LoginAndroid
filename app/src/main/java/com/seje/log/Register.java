package com.seje.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name,surname,age,username,password;
    //String str_name,str_surname,str_age,str_username,str_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.et_name);
        surname=findViewById(R.id.et_surname);
        age=findViewById(R.id.et_age);
        username=findViewById(R.id.et_username);
        password=findViewById(R.id.et_password);

    }

    public void onReg(View view){

            String str_name=name.getText().toString();
            String str_surname=surname.getText().toString();
            String str_age=age.getText().toString();
            String str_username=username.getText().toString();
            String str_password=password.getText().toString();
            String type = "register";

            BackgroundWorker backgroundWorker= new BackgroundWorker(this);
            backgroundWorker.execute(type,str_name,str_surname,str_age,str_username,str_password);

        }


}
