package com.binary.blood.bloodbankmanagement.application.schema;


/**
 * Created by Shaheb Ali on 1/13/2017.
 * Schema - RegisterTable
 */

public class RegisterTable {

    private static final String REG_TABLE_NAME = " member_register ";
    private static final String REG_COLM_MEM_ID = " memId ";
    private static final String REG_COLM_MEM_NAME = " memName ";
    private static final String REG_COLM_MEM_BG = " memBlodGroup ";
    private static final String REG_COLM_MEM_EMAIL = " memEmail ";
    private static final String REG_COLM_MEM_PHONE = " memPhone ";
    private static final String REG_COLM_MEM_PASS = " memPass ";
    private static final String REG_COLM_MEM_LOCATION = " memLocation ";

    private static final String CREATE_REGISTER_TABLE_QUERY = "CREATE TABLE"
            + REG_TABLE_NAME + "("
            + REG_COLM_MEM_ID + " integer primary key autoincrement, "
            + REG_COLM_MEM_NAME + " text, "
            + REG_COLM_MEM_BG + " text, "
            + REG_COLM_MEM_EMAIL + " text, "
            + REG_COLM_MEM_PHONE + " text, "
            + REG_COLM_MEM_PASS + " text, "
            + REG_COLM_MEM_LOCATION + " text);";
    private static final String DROP_REGISTER_TABLE = "DROP TABLE IF EXISTS " + getRegTableName();

    public static String getCreateRegisterTableQuery() {
        return CREATE_REGISTER_TABLE_QUERY;
    }

    public static String getDropRegisterTable() {
        return DROP_REGISTER_TABLE;
    }

    public static String getRegTableName() {
        return REG_TABLE_NAME;
    }

    public static String getRegColmMemId() {
        return REG_COLM_MEM_ID;
    }

    public static String getRegColmMemName() {
        return REG_COLM_MEM_NAME;
    }

    public static String getRegColmMemBg() {
        return REG_COLM_MEM_BG;
    }

    public static String getRegColmMemEmail() {
        return REG_COLM_MEM_EMAIL;
    }

    public static String getRegColmMemPhone() {
        return REG_COLM_MEM_PHONE;
    }

    public static String getRegColmMemPass() {
        return REG_COLM_MEM_PASS;
    }

    public static String getRegColmMemLocation() {
        return REG_COLM_MEM_LOCATION;
    }


}
