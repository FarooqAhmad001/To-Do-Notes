package com.hypersoft.notesapp.navigation

import androidx.navigation.NavHostController
import com.hypersoft.notesapp.utils.Action
import com.hypersoft.notesapp.utils.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = {
        navController.navigate("list/${it.name}"){
            popUpTo(LIST_SCREEN){
                inclusive = true
            }
        }
    }
    val task: (Int) -> Unit = {
        navController.navigate("task/${it}")
    }
}