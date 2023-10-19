package com.hypersoft.notesapp

import android.app.Application
import com.hypersoft.notesapp.utils.di.modules.roomModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NotesAppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin(){
        startKoin {
            androidContext(this@NotesAppApplication)
            modules(roomModule)
        }
    }

}