package com.rumad.week7app.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Todo(
        @PrimaryKey(autoGenerate = true) var uid: Int?,
        @ColumnInfo(name = "title") var title: String,
        @ColumnInfo(name = "description") var description: String?,
        @ColumnInfo(name = "deadline") var deadline: String
)