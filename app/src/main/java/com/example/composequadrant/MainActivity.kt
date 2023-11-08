package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    QuadrantOne(heading = "Text composable", info = "Displays text and follows the recommended Material Design guidelines.")
                    QuadrantTwo(heading = "Image composable", info = "Creates a composable that lays out and draws a given Painter class object.")
                    QuadrantThree(heading = "Row composable", info = "A layout composable that places its children in a horizontal sequence.")
                    QuadrantFour(heading = "Column composable", info = "A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}

@Composable
fun QuadrantOne(heading: String, info: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = heading,
            modifier = modifier
        )
        Text(
            text = info,
            modifier = modifier
        )
    }
}

@Composable
fun QuadrantTwo(heading: String, info: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = heading,
            modifier = modifier
        )
        Text(
            text = info,
            modifier = modifier
        )
    }
}

@Composable
fun QuadrantThree(heading: String, info: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = heading,
            modifier = modifier
        )
        Text(
            text = info,
            modifier = modifier
        )
    }
}

@Composable
fun QuadrantFour(heading: String, info: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = heading,
            modifier = modifier
        )
        Text(
            text = info,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        QuadrantOne(heading = "Text composable", info = "Displays text and follows the recommended Material Design guidelines.")
        QuadrantTwo(heading = "Image composable", info = "Creates a composable that lays out and draws a given Painter class object.")
        QuadrantThree(heading = "Row composable", info = "A layout composable that places its children in a horizontal sequence.")
        QuadrantFour(heading = "Column composable", info = "A layout composable that places its children in a vertical sequence.")
    }
}