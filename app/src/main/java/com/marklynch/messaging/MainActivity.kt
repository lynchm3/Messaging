package com.marklynch.messaging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.EditorModel
import androidx.ui.core.TextField
import androidx.ui.core.setContent
import androidx.ui.input.EditorStyle
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Main("Android")
            }
        }
    }
}

@Composable
fun Main(name: String) {
    Column() {
        val state = +state { EditorModel("") }
        TextField(
            value = state.value,
            onValueChange = { state.value = it },
            editorStyle = EditorStyle()
        )
        Button(text = "Register User",
            onClick = { registerUser(state.value.text) }
        )
    }
}

fun registerUser(s: String) {
    println("s = $s")
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Main("Android")
    }
}
