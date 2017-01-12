package com.binary.blood.bloodbankmanagement.application.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.binary.blood.bloodbankmanagement.application.Config;
import com.binary.blood.bloodbankmanagement.application.schema.RegisterTable;

/**
 * Created by Shaheb Ali on 1/13/2017.
 * Database Helper
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    public DatabaseHelper(Context context) {
        super(context, Config.getDbName(), null, Config.getDbVersion());
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(RegisterTable.getCreateRegisterTableQuery());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(RegisterTable.getDropRegisterTable());
        onCreate(db);
    }
}
