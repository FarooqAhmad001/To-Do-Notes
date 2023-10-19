package com.hypersoft.notesapp.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hypersoft.notesapp.domain.entities.Note
import com.hypersoft.notesapp.domain.repositories.NotesAppRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NotesAppViewModel(private val repository: NotesAppRepository): ViewModel() {

    private var _allTasks = MutableStateFlow<List<Note>>(emptyList())
    var allTasks: StateFlow<List<Note>> = _allTasks

    fun getAllTasks(){
        viewModelScope.launch {
            repository.getAllTasks().collect{
                _allTasks.value = it
            }
        }
    }
}