package com.rumad.week7app.db

import android.content.Context
import androidx.room.Room

class dbinstance {
    companion object {
        private var appDatabase: AppDatabase? = null

        fun getDatabase(c : Context): AppDatabase {
            if (appDatabase == null) {
                appDatabase = Room.databaseBuilder(
                        c.applicationContext,
                        AppDatabase::class.java, "database"
                ).build()
            }
            return appDatabase!!
        }

    }
}