package com.rumad.week7app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.R.id.async
import androidx.room.Room
import com.rumad.week7app.db.AppDatabase
import com.rumad.week7app.db.dao.TodoDao
import com.rumad.week7app.db.dbinstance
import com.rumad.week7app.db.entities.Todo
import java.util.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var todoDao: TodoDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todoDao = dbinstance.getDatabase(this).todoDao()

        thread {
            todoDao.insertAll(Todo(null, "Sample Todo", "Sample Description", Date().toString()))

            val todos = todoDao.getAll()

            Log.d(javaClass.name, "Finished inserting ${todos}")
        }


    }
}
