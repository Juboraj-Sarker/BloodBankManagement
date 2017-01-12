package com.binary.blood.bloodbankmanagement.application.activitydomain;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.binary.blood.bloodbankmanagement.R;

public class LoginActivity extends AppCompatActivity {
    private LinearLayout activity_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        activity_login = (LinearLayout) findViewById(R.id.activity_login);
        Drawable background = activity_login.getBackground();
        background.setAlpha(120);

    }
}
