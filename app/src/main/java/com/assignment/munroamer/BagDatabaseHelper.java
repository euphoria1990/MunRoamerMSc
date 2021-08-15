package com.assignment.munroamer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * A class that represents the Database to interact with and display users Munro Bag entries
 *
 * Users can use this to store their Munro bagging entries
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */

public class BagDatabaseHelper extends SQLiteOpenHelper {

    public static final String MY_BAG_DB = "mybag.db";
    public static final String TABLE_NAME = "mybag_data";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_MUNRO_NAME = "munroName";
    public static final String COLUMN_DIARY = "diary";
    public static final String COLUMN_ID = "ID";


    public BagDatabaseHelper(@Nullable Context context) {

        super(context, MY_BAG_DB, null, 1);
    }{

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_DATE + " TEXT, " + COLUMN_MUNRO_NAME + " TEXT, " + COLUMN_DIARY + " TEXT )";
        db.execSQL(createTable);

    }

    /**
     * A method to drop the table if it exists
     * @param db the database
     * @param oldVersion old version
     * @param newVersion new version
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

    }

    /**
     * A method to add data to the database
     * @param date the date
     * @param munroName the name of the munro
     * @param diary the users diary entry
     * @return
     */
    public boolean addData (String date, String munroName, String diary){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_DATE, date);
        contentValues.put(COLUMN_MUNRO_NAME, munroName);
        contentValues.put(COLUMN_DIARY, diary);

        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1){
            return false;
        }

        else{
            return true;
        }
    }

    /**
     * A method to get the list of contents in the database
     * @return the data
     */
    public Cursor getListContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        return data;

    }


}
