package com.hypersoft.notesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.hypersoft.notesapp.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation( navController: NavHostController){

    val screen = remember(navController){
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN){
        listComposable ( navigateToTaskScreen = screen.task )
        taskComposable (navigateToListscreen = screen.list)
    }

}