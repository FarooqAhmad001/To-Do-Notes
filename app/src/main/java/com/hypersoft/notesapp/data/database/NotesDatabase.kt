package com.hypersoft.notesapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hypersoft.notesapp.domain.entities.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NotesDatabase: RoomDatabase() {
    abstract fun NotesDAO(): NotesDAO

}