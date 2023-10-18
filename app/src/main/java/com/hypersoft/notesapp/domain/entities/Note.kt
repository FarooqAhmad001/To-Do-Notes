package com.hypersoft.notesapp.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hypersoft.notesapp.domain.enums.Priority
import com.hypersoft.notesapp.utils.Constants.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
