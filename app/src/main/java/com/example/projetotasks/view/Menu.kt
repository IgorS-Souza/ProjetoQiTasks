package com.example.projetotasks.view


import android.annotation.SuppressLint
import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projetotasks.backgroundGradient
import com.example.projetotasks.components.Boards

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MenuMain(navController: NavController){
    val gradientColorLogin = listOf(
        Color(0xFF37316d),
        Color(0xFF2d295c),
        Color(0xFF24214e),
        Color(0xFF1e1a3f)
    )
    val gradientBackgroundButtonLogin = listOf(
        Color(0xFFdd4c91),
        Color(0xFFe69871)
    )
    Column (
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color=Color.White)
        ){

        }
        Column(modifier = Modifier
            .fillMaxSize()
            .background(
                brush = backgroundGradient(
                    isVerticalGradient = false,
                    colors = gradientColorLogin
                )
            )
        ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
            ){
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Transparent)
                ){
                    Column (modifier = Modifier
                        .width(200.dp)
                        .fillMaxHeight()
                        .background(color = Color.Red)
                    ){
                        Boards()
                    }
                }
            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(
                    brush = backgroundGradient(
                        isVerticalGradient = false,
                        colors = gradientBackgroundButtonLogin
                    )
                )
            ){

            }
        }
    }
}