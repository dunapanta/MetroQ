package com.projecto.metroq.metroq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.projecto.metroq.metroq.views.ContainerActivity;
import com.projecto.metroq.metroq.views.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void createAccount(View view){

        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);



    }


    public void loginButton(View view){

        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);



    }
}
