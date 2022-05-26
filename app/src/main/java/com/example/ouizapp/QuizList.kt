package com.example.ouizapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quizlist_menory")
data class QuizList(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "memory_id") val id : Int = 0
)
