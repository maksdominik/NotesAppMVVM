package ru.mydikan.notesappmvvm.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.mydikan.notesappmvvm.navigation.NavRoute
import ru.mydikan.notesappmvvm.ui.theme.NotesAppMVVMTheme

@Composable
fun Start(navController: NavHostController) {
    Text(text = "Notes App test")
}
