package by.godevelopment.designpatterns.ui.screens.homescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import by.godevelopment.designpatterns.ui.theme.PracticeDesignPatternsTheme
import by.godevelopment.designpatterns.ui.views.GreetingView

@Composable
fun HomeScreen() {
    PracticeDesignPatternsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            GreetingView("Android")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PracticeDesignPatternsTheme {
        GreetingView("Android")
    }
}