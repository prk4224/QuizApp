package com.example.ouizapp

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

interface RoomQuizListDAO {

    @Insert(onConflict = REPLACE)
    fun insert(quizList: RoomQuizList)

    @Delete
    fun delete(quizList: RoomQuizList)

}