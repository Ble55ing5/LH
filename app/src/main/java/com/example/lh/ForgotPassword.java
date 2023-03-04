package com.example.lh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        TextView enter = findViewById(R.id.enter);
        TextView find = findViewById(R.id.forgot);
        TextView search = findViewById(R.id.searchbar);

        MaterialButton searchbtn = (MaterialButton)  findViewById(R.id.searchbtn);






    }
}