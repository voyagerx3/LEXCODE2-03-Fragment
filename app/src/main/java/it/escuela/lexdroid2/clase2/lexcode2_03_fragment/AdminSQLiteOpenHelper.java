package it.escuela.lexdroid2.clase2.lexcode2_03_fragment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by geovannyinca on 19/11/15.
 */
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="dbcontacts.db";
    public static final String TABLE_NAME="tcontacts";
    public static final String COL_1="firsname";
    public static final String COL_2="lastname";
    public static final String COL_3="phone";


    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tcontacts (firstname text,lastname text, phone text, photo text )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop if exists tcontacts");
        db.execSQL("create table tcontacts (firstname text,lastname text, phone text, photo text )");

    }
}
