package com.example.focustimer.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.focustimer.presentation.theme.FocusTimerTheme

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = Color.White,
    buttonColor: Color = Color.Blue,
    onTap: () -> Unit = {}
){
    Button(
        modifier = modifier.height(FocusTimerTheme.dimens.buttonHeightNormal),
        shape = RoundedCornerShape(FocusTimerTheme.dimens.roundedShapeNormal),
        colors = ButtonDefaults.buttonColors( containerColor = buttonColor ),
        onClick = { onTap() }
    ) {
        Text(
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically),
            style = MaterialTheme.typography.bodyLarge,
            text = text,
            color = textColor
        )
    }
}

// PREVIEW ANNOTATION
@Preview(showBackground = true, name = "CustomButton")
@Composable
fun CustomButtonPreview() {
    FocusTimerTheme {
        CustomButton(
            text = "Botón de prueba"
        )
    }
}