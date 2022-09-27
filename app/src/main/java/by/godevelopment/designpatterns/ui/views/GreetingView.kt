package by.godevelopment.designpatterns.ui.views

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import by.godevelopment.designpatterns.ui.theme.PracticeDesignPatternsTheme


@Composable
fun GreetingView(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun GreetingViewPreview() {
    PracticeDesignPatternsTheme {
        GreetingView("Android")
    }
}