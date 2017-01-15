package com.binary.blood.bloodbankmanagement.application.activitydomain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.binary.blood.bloodbankmanagement.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button registerBtnLink;
    private Button loginBtnLink;
    private TextView rulesTVBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerBtnLink = (Button) findViewById(R.id.registerBtnLink);
        loginBtnLink = (Button) findViewById(R.id.loginBtnLink);
        rulesTVBtn = (TextView) findViewById(R.id.rulesTVBtn);

        registerBtnLink.setOnClickListener(this);
        loginBtnLink.setOnClickListener(this);
        rulesTVBtn.setOnClickListener(this);

    }

    public void signUp(View view) {

        Intent intent = new Intent(MainActivity.this, RegestrationActivity.class);
        startActivity(intent);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.registerBtnLink:
                Intent registerBtnLinkIntent = new Intent(MainActivity.this, RegestrationActivity.class);
                startActivity(registerBtnLinkIntent);
                break;
            case R.id.loginBtnLink:
                Intent loginBtnLinkIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginBtnLinkIntent);
                break;
            case R.id.rulesTVBtn:
                Intent rulesLinkIntent = new Intent(MainActivity.this, BloodDonationRules.class);
                startActivity(rulesLinkIntent);
                break;

        }
    }
}
