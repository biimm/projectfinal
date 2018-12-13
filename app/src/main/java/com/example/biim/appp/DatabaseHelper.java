package com.example.biim.appp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "subject.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "Schedule";
    public static final String COL_SUB = "Subject";
    public static final String COL_TITLE = "title";
    public static final String COL_NUMBER = "number";
    public static final String COL_IMAGE = "image";

    public DatabaseHelper(@RecentlyNullable Context context, @RecentlyNullable String name, @RecentlyNullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
