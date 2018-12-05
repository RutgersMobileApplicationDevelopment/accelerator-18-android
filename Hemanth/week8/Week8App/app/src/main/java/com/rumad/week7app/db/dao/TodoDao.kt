package com.rumad.week7app.db.dao

import androidx.room.*
import com.rumad.week7app.db.entities.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAll(): List<Todo>

    @Query("SELECT * FROM todo WHERE uid IN (:todoIds)")
    fun loadAllByIds(todoIds: IntArray): List<Todo>

    @Query("SELECT * FROM Todo WHERE title LIKE :title LIMIT 1")
    fun findByTitle(title: String): Todo

    @Insert
    fun insertAll(vararg  todos: Todo)

    @Delete
    fun delete(user: Todo)
}