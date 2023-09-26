package com.example.projetotasks.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projetotasks.TextComponent
import com.example.projetotasks.backgroundGradient

@Composable
fun LoginMain(
    navController: NavController
){
    val gradientColorLogin = listOf(
        Color(0xFF37316d),
        Color(0xFF2d295c),
        Color(0xFF24214e),
        Color(0xFF1e1a3f)
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = backgroundGradient(
                    isVerticalGradient = true,
                    colors = gradientColorLogin
                )
            )

    ){
        val gradientBackgroundButtonLogin = listOf(
            Color(0xFFdd4c91),
            Color(0xFFe69871)
        )
        val shapeButton = Shapes(
            small = RoundedCornerShape(5.dp),
            medium = RoundedCornerShape(10.dp),
            large = RoundedCornerShape(30.dp),
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(
                space = 25.dp,
                alignment = Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            TextComponent(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp)
                ,

                label = "Username"
            )
            TextComponent(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp),

                label = "Password"
            )
            Button(
                onClick = {
                    navController.navigate(route = "Menu")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                modifier = Modifier
                    .padding(top = 50.dp)
                    .background(
                        brush = backgroundGradient(
                            isVerticalGradient = false,
                            colors = gradientBackgroundButtonLogin
                        ),
                        shape = shapeButton.large
                    )
                    .width(170.dp)
                    .height(40.dp)
            ) {
                Text("LOGIN", fontSize = 18.sp)
            }
        }
    }
}