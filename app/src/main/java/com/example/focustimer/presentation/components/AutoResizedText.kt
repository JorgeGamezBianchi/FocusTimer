package com.example.focustimer.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.focustimer.presentation.theme.FocusTimerTheme

@Composable
fun AutoResizedText(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.displayLarge,
){
    var timeTextStyle by remember { mutableStateOf(textStyle)}
    val fontSizeFactor = 0.95
    Text(
        text = text,
        modifier = modifier.fillMaxWidth(),
        softWrap = false,
        style = timeTextStyle,
        onTextLayout = { result ->
            // Funcion para calcular la medida en pantalla, verifica si se sale de la pantalla y con el factor de ajuste lo ajusta
            if (result.didOverflowWidth) {
                timeTextStyle = timeTextStyle.copy(fontSize = timeTextStyle.fontSize * fontSizeFactor)
            }
        }
    )
}

// PREVIEW ANNOTATION
@Preview(showBackground = true, name = "AutoResizedText")
@Composable
fun AutoResizedTextPreview() {
    FocusTimerTheme {
        AutoResizedText(
            text = "Focus Timer"
        )
    }
}
