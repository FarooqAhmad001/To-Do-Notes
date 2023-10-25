package com.hypersoft.notesapp.ui.screens.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hypersoft.notesapp.ui.theme.customColorPalette

@Composable
fun ListAppBar(){
    DefaultListAppBar()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(){
    TopAppBar(
        title = {
            Text(text = "Tasks")
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.customColorPalette.topAppBarColor
        )
    )
}

@Composable
@Preview
private fun DefaultListAppBarPreview(){
    DefaultListAppBar()
}