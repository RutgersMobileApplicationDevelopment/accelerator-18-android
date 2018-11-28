package com.rumad.week7app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rumad.week7app.db.dao.TodoDao
import com.rumad.week7app.db.entities.Todo

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}