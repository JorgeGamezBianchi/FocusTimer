package com.example.focustimer.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.focustimer.presentation.theme.FocusTimerTheme

@Composable
fun InformationItem(
    modifier: Modifier = Modifier,
    text: String,
    label: String
){
    Column(
        modifier = modifier
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.bodyLarge,
            text = text,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.bodyLarge,
            text = label,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

// PREVIEW ANNOTATION
@Preview(showBackground = true, name = "InformationItem")
@Composable
fun InformationItemPreview() {
    FocusTimerTheme {
        InformationItem(
            text = "Botón de prueba",
            label = "Etiqueta de prueba"
        )
    }
}