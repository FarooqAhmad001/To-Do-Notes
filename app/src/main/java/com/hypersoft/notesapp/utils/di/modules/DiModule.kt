package com.hypersoft.notesapp.utils.di.modules

import androidx.room.Room
import com.hypersoft.notesapp.data.database.NotesDatabase
import com.hypersoft.notesapp.domain.repositories.NotesAppRepository
import com.hypersoft.notesapp.ui.viewModels.NotesAppViewModel
import com.hypersoft.notesapp.utils.Constants.DATABASE_NAME
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val roomModule = module {
    single { Room.databaseBuilder(androidApplication(), NotesDatabase::class.java, DATABASE_NAME).build() }
    single { get<NotesDatabase>().NotesDAO() }
    single { NotesAppRepository(get()) }

    viewModel { NotesAppViewModel(get()) }
}