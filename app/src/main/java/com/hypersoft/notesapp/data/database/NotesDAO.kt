package com.hypersoft.notesapp.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.hypersoft.notesapp.domain.entities.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NotesDAO {
    @Query("SELECT * FROM notes_table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<Note>>

    @Query("SELECT * FROM notes_table WHERE id=:taskId")
    fun getSelectedTask(taskId: Int): Flow<Note>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(model: Note)

    @Update
    suspend fun updateTask(model: Note)

    @Delete
    suspend fun deleteTask(model: Note)

    @Query("DELETE FROM notes_table")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM notes_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<Note>>

    @Query("SELECT * FROM notes_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<Note>>

    @Query("SELECT * FROM notes_table ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'L%' THEN 3 END")
    fun sortByHighPriority(): Flow<List<Note>>

}