package com.assignment.munroamer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
/**
 * A class that represents the "Database" for MunRoamer
 *
 * This is used to store users login details
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String TABLE_NAME_BAG = "myBag";
    public DatabaseHelper(@Nullable Context context) {
        super(context, "munRoam.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user (firstName text, lastName text, email text primary key,password text)");


    }

    /**
     * a method to check user exists and drop the table
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");


    }

    /**
     * A method to insert data into the database
     * @param firstName users first name
     * @param lastName users last name
     * @param email users email
     * @param password users password
     * @return the result
     */
    public boolean insert(String firstName, String lastName, String email, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("firstName",firstName);
        contentValues.put("lastName",lastName);
        contentValues.put("email", email);
        contentValues.put("password",password);
        long ins = db.insert("user", null, contentValues);
        if (ins  ==-1) return false;
        else return true;
    }

    /**
     * A method to check if the users email already exists in the database
     * @param email users email
     * @return result of check
     */
    public Boolean emailChk(String email){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email=?", new String[]{email});
        if(cursor.getCount()>0) return false;
        else return true;


    }

    /**
     * A method to check if the users email and password match
     * @param email users email
     * @param password users password
     * @return result of check
     */
    public Boolean emlPassCheck (String email, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where email=? and password=?", new String[]{email,password});
        if (cursor.getCount()>0) return true;
        else return false;

    }


}
