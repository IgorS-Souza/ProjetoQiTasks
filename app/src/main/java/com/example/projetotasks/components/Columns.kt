package com.example.projetotasks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun Columns(cor: Int, label: String){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .background(
                Color(cor)
            )
    ) {
        Text(text = label, fontSize = 18.sp)
    }
}
