package com.binary.blood.bloodbankmanagement.application.activitydomain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.binary.blood.bloodbankmanagement.R;
import com.binary.blood.bloodbankmanagement.application.controller.RegisterManager;
import com.binary.blood.bloodbankmanagement.application.model.RegisterModel;

public class RegestrationActivity extends AppCompatActivity {
    RegisterManager registerManager;
    private EditText memberId;
    private EditText memberName;
    private EditText memberEmail;
    private EditText memberPhone;
    private EditText memberPass;
    private EditText memberPassConfirm;
    private EditText memberLocation;
    private Spinner memberBGSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        memberName = (EditText) findViewById(R.id.memberNameET);
        memberEmail = (EditText) findViewById(R.id.memberEmailET);
        memberPhone = (EditText) findViewById(R.id.memberPhoneET);
        memberPass = (EditText) findViewById(R.id.memberPassET);
        memberPassConfirm = (EditText) findViewById(R.id.memberPassETConfirm);
        memberLocation = (EditText) findViewById(R.id.memberLocationET);
        memberBGSpinner = (Spinner) findViewById(R.id.memberBGSpinner);
        registerManager = new RegisterManager(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void save(View view) {
        String name     = memberName.getText().toString();
        String email    = memberEmail.getText().toString();
        String phone    = memberPhone.getText().toString();
        String pass     = memberPass.getText().toString();
        String confirmPass = memberPassConfirm.getText().toString();
        String location = memberLocation.getText().toString();
        String bg       = memberBGSpinner.getSelectedItem().toString();


        RegisterModel registerModel = new RegisterModel(name, email, phone, pass, location, bg);
        if(name.isEmpty() || email.isEmpty() || phone.isEmpty() || pass.isEmpty() || location.isEmpty() || bg.isEmpty() ){
            Toast.makeText(this, "Field must be filled", Toast.LENGTH_SHORT).show();
        }else if(pass.equals(confirmPass)){
            Toast.makeText(this, "Password Not Matched.", Toast.LENGTH_SHORT).show();
        }else {
            long insertResultRow = registerManager.addMember(registerModel);
            if (insertResultRow > 0) {
                Intent intent = new Intent(RegestrationActivity.this, LoginActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Thanks You are successfully Registered" + insertResultRow, Toast.LENGTH_SHORT).show();

            }
        }

    }
}
