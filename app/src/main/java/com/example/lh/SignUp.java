package com.example.lh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView username = findViewById(R.id.username2);
        TextView email = findViewById(R.id.email);
        TextView password = findViewById(R.id.password2);

        MaterialButton create = (MaterialButton)  findViewById(R.id.createbtn);
        MaterialButton login = (MaterialButton)  findViewById(R.id.signin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,MainActivity.class));
            }
        });
    }
}