package com.binary.blood.bloodbankmanagement.application.activitydomain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.binary.blood.bloodbankmanagement.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void signUp(View view) {

        Intent intent = new Intent(MainActivity.this, RegestrationActivity.class);
        startActivity(intent);



    }
}
