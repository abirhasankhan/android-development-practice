package com.aceares.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickRegBtn(View view){
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextPhone = findViewById(R.id.editTextPhone);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        TextView txtName = findViewById(R.id.textViewName);
        TextView txtPhone = findViewById(R.id.textViewPhone);
        TextView txtEmail = findViewById(R.id.textViewEmail);

        txtName.setText("Name : " + editTextName.getText().toString());
        txtPhone.setText("Phone number : " + editTextPhone.getText().toString());
        txtEmail.setText("email : " + editTextEmail.getText().toString());

    }
}