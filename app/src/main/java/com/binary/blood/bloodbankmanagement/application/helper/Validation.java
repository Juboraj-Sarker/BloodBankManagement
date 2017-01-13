package com.binary.blood.bloodbankmanagement.application.helper;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Shaheb.Ali on 1/13/2017.
 */

public class Validation {

    public static final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    private EditText emailAddress;
    private String getEmailValidation;
    private String email;

    public void getEmailValidation(EditText emailAdd, Context context) {
        emailAddress = emailAdd;
        email = emailAddress.getText().toString().trim();

        final Context finalContext = context;
        emailAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!email.matches(emailPattern) && !(editable.length() > 0)) {
                    Toast.makeText(finalContext, "Invalid Email Address", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
