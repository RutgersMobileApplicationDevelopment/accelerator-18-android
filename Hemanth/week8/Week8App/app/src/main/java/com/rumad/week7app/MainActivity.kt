package com.rumad.week7app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.R.id.async
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rumad.week7app.db.entities.Todo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.viewholder_todo.view.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var viewmodel : TodoViewModel

    lateinit var adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel = ViewModelProvider
                .AndroidViewModelFactory
                .getInstance(application).create(TodoViewModel :: class.java)


        viewmodel.getTodos().observe(this, androidx.lifecycle.Observer {
            adapter.updateTodos(it)
        })

        adapter = Adapter({
            viewmodel.deleteTodo(it)
        })

        recyclerview_todos.adapter = adapter
        recyclerview_todos.layoutManager = LinearLayoutManager(this)

        fab_add.setOnClickListener {
            viewmodel.addTodo(getTodoFromForm())
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
