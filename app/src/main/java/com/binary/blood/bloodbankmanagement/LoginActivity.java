package com.binary.blood.bloodbankmanagement;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

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
