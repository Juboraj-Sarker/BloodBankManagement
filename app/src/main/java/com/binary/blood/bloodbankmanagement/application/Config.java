package com.binary.blood.bloodbankmanagement.application;

/**
 * Created by dell on 1/13/2017.
 * Config File
 */

public class Config {
    private static final String DB_NAME = "bdms_register";
    private static final int DB_VERSION = 1;

    public static String getDbName() {
        return DB_NAME;
    }

    public static int getDbVersion() {
        return DB_VERSION;
    }
}
