package com.srutin;

/**
 * Created by Srutin Reddy on 1/27/2016.
 */
public class DbConstants {

    public static String DB_NAME="codeforce.db";
    public static int DB_Version=1;
    public static String TAB_LOGIN="login";
    public static String Query_create= "create table if not exists "+ TAB_LOGIN+"" +
            "(unm text PRIMARY KEY, pwd text, fName text, lName text, address text, zipCode text)";
    public static String Query_delete= "DROP TABLE "+ TAB_LOGIN+")";
}
