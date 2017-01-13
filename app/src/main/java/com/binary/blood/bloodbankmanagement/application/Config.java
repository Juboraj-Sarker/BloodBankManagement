package com.binary.blood.bloodbankmanagement.application;

/**
 * Created by dell on 1/13/2017.
 * Config File
 */

public class Config {
    private static final String DB_NAME = "bdms_register";
    private static final int DB_VERSION = 1;
    /*
    * Email Validation Pattern
    * */
    private static final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    /*
    * Phone Validation Pattern
    * */
    private static final String phonePattern = "^\\+?[0-9]{3}-?[0-9]{6,12}$";

    public static String getDbName() {
        return DB_NAME;
    }

    public static int getDbVersion() {
        return DB_VERSION;
    }

    public static String getEmailPattern() {
        return emailPattern;
    }

    public static String getPhonePattern() {
        return phonePattern;
    }
}
