package com.rumad.week7app

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rumad.week7app.db.dao.TodoDao
import com.rumad.week7app.db.dbinstance
import com.rumad.week7app.db.entities.Todo
import kotlin.concurrent.thread

class TodoViewModel(app : Application) : AndroidViewModel(app) {
    var todoDao: TodoDao

    private var todos : MutableLiveData<List<Todo>>


    init {
        todoDao = dbinstance.getDatabase(app).todoDao()
        todos = MutableLiveData()

        thread {
            todos.postValue(todoDao.getAll())
        }

    }

    fun getTodos() = todos

    fun addTodo(todo : Todo) {
        thread {
            todoDao.insertAll(todo)
            todos.postValue(todoDao.getAll())
        }
    }

    fun deleteTodo(todo : Todo) {
        thread {
            todoDao.delete(todo)
            todos.postValue(todoDao.getAll())
        }
    }
}