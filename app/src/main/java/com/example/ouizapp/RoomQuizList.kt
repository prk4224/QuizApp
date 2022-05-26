package com.example.ouizapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// 문제 넘버, 문제내용, 정답1, 정답2, 정답3, 정답 맞힌 갯수
@Entity(tableName = "room_quizlist")
class RoomQuizList {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    var no : Int? = null

    @ColumnInfo
    var quiz_contents : String = ""

    @ColumnInfo
    var quiz_answer01 : String = ""

    @ColumnInfo
    var quiz_answer02 : String = ""

    @ColumnInfo
    var quiz_answer03 : String = ""

    @ColumnInfo
    var answer_cnt : Int = 0

    constructor(quiz_contents:String, quiz_answer01:String, quiz_answer02:String, quiz_answer03:String, answer_cnt:Int){
        this.quiz_contents = quiz_contents
        this.quiz_answer01 = quiz_answer01
        this.quiz_answer02 = quiz_answer02
        this.quiz_answer03 = quiz_answer03
        this.answer_cnt = answer_cnt
    }
}