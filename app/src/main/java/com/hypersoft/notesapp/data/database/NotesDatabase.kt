package com.hypersoft.notesapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hypersoft.notesapp.domain.entities.Note
import com.hypersoft.notesapp.utils.Constants.DATABASE_NAME

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NotesDatabase: RoomDatabase() {
    abstract fun NotesDAO(): NotesDAO

    companion object {
        @Volatile
        private var INSTANCE: NotesDatabase? = null

        fun getDatabase(context: Context): NotesDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(context, NotesDatabase::class.java, DATABASE_NAME).build()
                }
            }
            return INSTANCE!!
        }
    }

}