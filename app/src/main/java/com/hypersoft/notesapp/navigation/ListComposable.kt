package com.hypersoft.notesapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hypersoft.notesapp.ui.screens.list.ListScreen
import com.hypersoft.notesapp.utils.Constants

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
){
    composable(route = Constants.LIST_SCREEN, arguments = listOf(navArgument(Constants.LIST_ARGUMENT_KEY){
        type = NavType.StringType
    })
    ){
        ListScreen(navigateToTaskScreen = navigateToTaskScreen)
    }
}