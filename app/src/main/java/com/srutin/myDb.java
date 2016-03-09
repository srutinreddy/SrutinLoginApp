package com.srutin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Srutin Reddy on 1/27/2016.
 */


    public class myDb extends SQLiteOpenHelper {

    private SQLiteDatabase mDB;


    public myDb(Context context) {
        super(context, DbConstants.DB_NAME,null, DbConstants.DB_Version);
        mDB=getWritableDatabase();
    }

    public long insert(String tabName,String colName, ContentValues cv){
        return mDB.insert(tabName, colName, cv);
    }

    public boolean isValidLogin(String unm, String pwd)  {

        String query= "select * from "+DbConstants.TAB_LOGIN+" where unm='"+unm+"' and pwd='"+pwd+"'" ;

        Cursor cur=mDB.rawQuery(query,null);
        if (cur.getCount()>0)
            return true;
        else {
            return  false;

        }

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DbConstants.Query_create);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL(DbConstants.Query_delete);
    }
}
