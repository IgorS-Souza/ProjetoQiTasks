package com.example.projetotasks.components


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.example.projetotasks.backgroundGradient


@Composable
fun Boards(

){
    val gradientBackgroundButtonLogin = listOf(
        Color(0xFFdd4c91),
        Color(0xFFe69871)
    )
    Column(
        modifier = Modifier
            .background(color = Color.Blue)
            .width(160.dp)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 0.dp,
            alignment = Alignment.Bottom
        ),
    ){
        TextButton(
            onClick = {

            },
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .background(
                    color = Color.Transparent
                )
                .padding(start = 10.dp)
                .drawBehind {
                    val strokeWidthPx = 2f
                    val color = Color.White
                    val width = size.width
                    val height = size.height
                    val cornerRadius = height * 2 / 100

                    // Top line
                    drawLine(
                        color = color,
                        start = Offset(x = width, y = 0f),
                        end = Offset(x = cornerRadius, y = 0f),
                        strokeWidth = strokeWidthPx
                    )

                    // Bottom line
                    //drawLine(
                        //color = Color.Red,
                        //start = Offset(x = cornerRadius, y = height),
                        //end = Offset(x = width, y = height),
                        //strokeWidth = strokeWidthPx
                    //)

                    // Left line
                    drawLine(
                        color = color,
                        start = Offset(x = 0f, y = cornerRadius),
                        end = Offset(x = 0f, y = height - cornerRadius),
                        strokeWidth = strokeWidthPx
                    )
                    // Right line
                    drawLine(
                        color = Color.Yellow,
                        start = Offset(x = width, y = 0f),
                        end = Offset(x = width , y = height),
                        strokeWidth = strokeWidthPx
                    )
                    // Top left arc
                    drawArc(
                        color = color,
                        startAngle = 180f,
                        sweepAngle = 90f,
                        useCenter = false,
                        topLeft = Offset.Zero,
                        size = Size(cornerRadius * 2, cornerRadius * 2),
                        style = Stroke(width = strokeWidthPx)
                    )

                    // Bottom left arc
                    //drawArc(
                        //color = color,
                        //startAngle = 90f,
                        //sweepAngle = 90f,
                        //useCenter = false,
                        //topLeft = Offset(x = 0f, y = height - 2 * cornerRadius),
                        //size = Size(cornerRadius * 2, cornerRadius * 2),
                        //style = Stroke(width = strokeWidthPx)
                    //)

                    // Bottom right arc
                    drawArc(
                        color = color,
                        startAngle = 0f,
                        sweepAngle = 90f,
                        useCenter = false,
                        topLeft = Offset(
                            x = width - 2 * cornerRadius,
                            y = height - 2 * cornerRadius
                        ),
                        size = Size(cornerRadius * 2, cornerRadius * 2),
                        style = Stroke(width = strokeWidthPx)
                    )
                    // Bottom right arc
                    drawArc(
                        color = color,
                        startAngle = 90f,
                        sweepAngle = 90f,
                        useCenter = false,
                        topLeft = Offset(width / 2f,0f),
                        size = Size(width / 2f - width, height / 2f - 0f),
                        style = Stroke(width = strokeWidthPx)
                    )

                },
            shape = RoundedCornerShape(1.dp)


        ) {
            Text(
                text = "Board 1",
                color = Color.White
            )
        }
    }
}
