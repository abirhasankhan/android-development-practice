package edu.ewubd.test01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        setContentView(R.layout.activity_main);

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
    }
    void funOutDoor(){
        System.out.println(outDoor.getText().toString().trim());
    }
    void funOnline(){
        System.out.println(online.getText().toString().trim());
    }

    public void funSave() {

        String e_name = EditTname.getText().toString().trim();
        String e_place = EditTplace.getText().toString().trim();
        String e_date = EditTdateAndTime.getText().toString().trim();
        String e_capacity = EditTcapacity.getText().toString().trim();
        String e_budget = EditTbudget.getText().toString().trim();
        String e_email = EditTemail.getText().toString().trim();
        String e_phone = EditTphone.getText().toString().trim();
        String e_des = EditTdes.getText().toString().trim();

        String type = "";
        if (indoor.isChecked()) {
            type = "Indoor";
        } else if (outDoor.isChecked()) {
            type = "Outdoor";
        } else if (online.isChecked()) {
            type = "Online";
        }

        String errMsg = "";

        if (e_name.length() < 4 || e_name.length() > 12 || !e_name.matches("[a-z A-Z]+")) {
            errMsg = "Invalid name ";
        }

        if (e_place.length() < 6 || e_place.length() > 64) {
            errMsg += "Invalid place ";
        }
        if (e_phone.length() < 8 || e_phone.length() > 18) {
            errMsg += "Invalid Phone Number ";
        }
        if (e_capacity.length() <= 0) {
            errMsg += "Invalid Capacity Must be ";
        }
        if (e_budget.length() <= 3){
            errMsg = "Invalid Budget Must be 1000 ";
        }
        if (e_des.length() < 10 || e_des.length() > 1000) {
            errMsg = "Invalid Description ";
        }


        boolean isIndoorchecked = indoor.isChecked();
        boolean isOutdoorchecked = outDoor.isChecked();
        boolean isOnlinechecked = online.isChecked();


        if (!(isIndoorchecked | isOutdoorchecked | isOnlinechecked))
        {
            errMsg = "Invalid Type ";
        }

        if (errMsg.length() > 0) {
            showErrorMessage(errMsg);
            return;
        }


        String value = e_name + "-::-" + e_place + "-::-" + type + "-::-" + e_date + "-::-" + e_capacity + "-::-" + e_budget + "-::-" + e_email + "-::-" + e_phone + "-::-" + e_des;

        System.out.println(value);

    }


    void funShare(){

        System.out.println("Has been share");

    }
    void funCancel(){


        System.out.println("Has been cancel");

    }

    private void showErrorMessage (String errMsg){
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Error");
        b.setMessage(errMsg);
        b.setCancelable(true);
        b.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad = b.create();
        ad.show();
    }
}

