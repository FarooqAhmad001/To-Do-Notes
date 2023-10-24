package com.hypersoft.notesapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hypersoft.notesapp.utils.Action
import com.hypersoft.notesapp.utils.Constants.TASK_ARGUMENT_KEY
import com.hypersoft.notesapp.utils.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListscreen: (Action) -> Unit
){
    composable(route = TASK_SCREEN, arguments = listOf(navArgument(TASK_ARGUMENT_KEY){
        type = NavType.IntType
    })){

    }

}