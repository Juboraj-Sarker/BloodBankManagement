package com.binary.blood.bloodbankmanagement.application.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.binary.blood.bloodbankmanagement.application.helper.DatabaseHelper;
import com.binary.blood.bloodbankmanagement.application.model.RegisterModel;
import com.binary.blood.bloodbankmanagement.application.schema.RegisterTable;

import java.util.ArrayList;

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

    public ArrayList<RegisterModel> getAllRegisterMemberList() {
        ArrayList<RegisterModel> getAllMemberList = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();
        String selectQuery = "SELECT * FROM" + RegisterTable.getRegTableName();
        Cursor cursor = sqLiteDatabase.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndex(RegisterTable.getRegColmMemId()));
                String name = cursor.getString(cursor.getColumnIndex(RegisterTable.getRegColmMemName()));
                String email = cursor.getString(cursor.getColumnIndex(RegisterTable.getRegColmMemEmail()));
                String phone = cursor.getString(cursor.getColumnIndex(RegisterTable.getRegColmMemPhone()));
                String pass = cursor.getString(cursor.getColumnIndex(RegisterTable.getRegColmMemPass()));
                String location = cursor.getString(cursor.getColumnIndex(RegisterTable.getRegColmMemLocation()));
                String bg = cursor.getString(cursor.getColumnIndex(RegisterTable.getRegColmMemBg()));

                RegisterModel registerModel = new RegisterModel(String.valueOf(id), name, email, phone, pass, location, bg);
                getAllMemberList.add(registerModel);
            } while (cursor.moveToNext());
        }

        return getAllMemberList;
    }
}
