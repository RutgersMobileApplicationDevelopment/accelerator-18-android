package com.rumad.week7app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.R.id.async
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.rumad.week7app.db.AppDatabase
import com.rumad.week7app.db.dao.TodoDao
import com.rumad.week7app.db.dbinstance
import com.rumad.week7app.db.entities.Todo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.viewholder_todo.view.*
import java.util.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var todoDao: TodoDao

    lateinit var adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todoDao = dbinstance.getDatabase(this).todoDao()

        adapter = Adapter({
            deleteTodo(it)
        })

        recyclerview_todos.adapter = adapter
        recyclerview_todos.layoutManager = LinearLayoutManager(this)

        updateTodoList()

        fab_add.setOnClickListener {
            addTodo(getTodoFromForm())
        }
    }

    fun updateTodoList() {
        thread {
            adapter.updateTodos(todoDao.getAll())
        }
    }

    fun addTodo(todo: Todo) {
        thread {
            todoDao.insertAll(todo)
            adapter.todos.add(todo)
            runOnUiThread {
                adapter.notifyDataSetChanged()
            }

            Log.d(javaClass.name, "Finished inserting ${todo}")
        }
    }

    fun deleteTodo(todo : Todo) {
        thread {
            todoDao.delete(todo)
            val newTodos = todoDao.getAll()
            runOnUiThread {
                adapter.updateTodos(newTodos)
            }

            Log.d(javaClass.name, "Finished deleting ${todo}")
        }
    }

    fun getTodoFromForm() : Todo  = Todo(
            null,
            edittext_title.text.toString(),
            edittext_description.text.toString(),
            Date().toString() // Quick fix
    )

    inner class TodoHolder(v : View) : RecyclerView.ViewHolder(v) {

    }

    inner class Adapter(val onLongClick : (todo : Todo) -> Unit) : RecyclerView.Adapter<TodoHolder>() {
        val todos: MutableList<Todo> = mutableListOf()

        fun updateTodos(newTodos : List<Todo>) {
            todos.clear()
            todos.addAll(newTodos)
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder = TodoHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.viewholder_todo, parent, false)
        )

        override fun getItemCount(): Int = todos.size

        override fun onBindViewHolder(holder: TodoHolder, position: Int) {
            val todo = todos[position]

            holder.itemView.apply {
                title.text = todo.title
                description.text = todo.description
                deadline.text = todo.deadline
                setOnLongClickListener({
                    onLongClick(todo)
                    true
                })
            }


        }
    }
}
