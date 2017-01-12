package com.binary.blood.bloodbankmanagement.application.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.binary.blood.bloodbankmanagement.application.helper.DatabaseHelper;
import com.binary.blood.bloodbankmanagement.application.model.RegisterModel;
import com.binary.blood.bloodbankmanagement.application.schema.RegisterTable;

/**
 * Created by Shaheb Ali on 1/13/2017.
 * Registration Manager
 */

public class RegisterManager {
    DatabaseHelper databaseHelper;
    RegisterTable registerTable;
    Context context;

    public RegisterManager(Context context) {
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
        registerTable = new RegisterTable();
    }

    public long addMember(RegisterModel registerModel) {
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RegisterTable.getRegColmMemName(), registerModel.getMemberName());
        contentValues.put(RegisterTable.getRegColmMemPhone(), registerModel.getMemberPhone());
        contentValues.put(RegisterTable.getRegColmMemEmail(), registerModel.getMemberPhone());
        contentValues.put(RegisterTable.getRegColmMemPass(), registerModel.getMemberPass());
        contentValues.put(RegisterTable.getRegColmMemLocation(), registerModel.getMemberLocation());

        long insertedRow = sqLiteDatabase.insert(RegisterTable.getRegTableName(), null, contentValues);
        sqLiteDatabase.close();
        return insertedRow;

    }
}
