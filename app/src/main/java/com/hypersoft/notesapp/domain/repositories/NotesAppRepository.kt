package com.hypersoft.notesapp.domain.repositories

import com.hypersoft.notesapp.data.database.NotesDAO
import com.hypersoft.notesapp.domain.entities.Note

class NotesAppRepository(private val notesDao: NotesDAO) {

    fun getAllTasks() = notesDao.getAllTasks()
    fun getSelectedTasks(taskId: Int) = notesDao.getSelectedTask(taskId)
    fun sortByLowPriority() = notesDao.sortByLowPriority()
    fun sortByHighPriority() = notesDao.sortByHighPriority()
    fun searchDatabase(searchQuery: String) = notesDao.searchDatabase(searchQuery)

    suspend fun addTask(note: Note) = notesDao.addTask(note)
    suspend fun updateTask(note: Note) = notesDao.updateTask(note)
    suspend fun deleteTask(note: Note) = notesDao.deleteTask(note)
    suspend fun deleteAllTask() = notesDao.deleteAllTasks()

}