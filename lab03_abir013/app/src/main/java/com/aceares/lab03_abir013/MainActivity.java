package com.aceares.lab03_abir013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText EditTname, EditTplace, EditTdateAndTime, EditTcapacity, EditTbudget, EditTemail, EditTphone,EditTdes;
    Button save, share, cancel;
    RadioButton indoor, outDoor, online;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout01);

        EditTname = findViewById(R.id.EditTname);
        EditTplace = findViewById(R.id.EditTplace);
        EditTdateAndTime = findViewById(R.id.EditTdateAndTime);
        EditTcapacity = findViewById(R.id.EditTcapacity);
        EditTbudget = findViewById(R.id.EditTbudget);
        EditTemail = findViewById(R.id.EditTemail);
        EditTphone = findViewById(R.id.EditTphone);
        EditTdes = findViewById(R.id.EditTdes);

        indoor = findViewById(R.id.indoor);
        outDoor = findViewById(R.id.outdoor);
        online = findViewById(R.id.online);

        save = findViewById(R.id.btnSave);
        share = findViewById(R.id.btnShare);
        cancel = findViewById(R.id.btnCancel);

        indoor.setOnClickListener(view -> funIndoor());
        outDoor.setOnClickListener(view -> funOutDoor());
        online.setOnClickListener(view -> funOnline());

        save.setOnClickListener(view -> funSave());
        share.setOnClickListener(view -> funShare());
        cancel.setOnClickListener(view -> funCancel());

    }

    void funIndoor(){
        System.out.println(indoor.getText().toString().trim());
        if(indoor.isChecked()){
            System.out.println("Indoor Clicked");
        }
    }
    void funOutDoor(){
        System.out.println(outDoor.getText().toString().trim());
        if(outDoor.isChecked()){
            System.out.println("Outdoor Clicked");
        }
    }
    void funOnline(){
        System.out.println(online.getText().toString().trim());
        if(online.isChecked()){
            System.out.println("Online Clicked");
        }
    }

    void funSave(){
        System.out.println(save.getText().toString().trim());
        if(save.isClickable()){
            System.out.println("Has been save");
        }
    }

    void funShare(){
        System.out.println(share.getText().toString().trim());
        if(share.isClickable()){
            System.out.println("Has been share");
        }
    }
    void funCancel(){
        System.out.println(cancel.getText().toString().trim());
        if(cancel.isClickable()){
            System.out.println("Has been cancel");
        }
    }
}