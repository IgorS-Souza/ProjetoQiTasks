package com.example.projetotasks


import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.text.style.BackgroundColorSpan
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projetotasks.ui.theme.ProjetoTasksTheme
import com.example.projetotasks.view.LoginMain
import com.example.projetotasks.view.MenuMain
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import java.nio.file.WatchEvent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoTasksTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "Login"){
                    composable(
                        route = "Login"
                    ){
                        LoginMain(navController)
                    }
                    composable(
                        route = "Menu"
                    ){
                        MenuMain(navController)
                    }
                }
            }
        }
    }
}
@Composable

fun backgroundGradient(
    isVerticalGradient: Boolean,
    colors: List<Color>
): Brush {
    val endOffset = if(isVerticalGradient){
        Offset(x=0f,Float.POSITIVE_INFINITY)
    }else{
        Offset(Float.POSITIVE_INFINITY,y=0f)
    }
    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun TextComponent(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String
)
{
    TextField(
        value = value,
        onValueChange = {},
        modifier
            .background(Color(0xFF1f1a43))
            .padding(
                start = 0.dp,
                end = 0.dp,
                top = 0.dp
            ),
        shape = RoundedCornerShape(8.dp),
        label = {
            Text(text = label, color = Color(0xFF4b408c), fontSize = 16.sp)
        },
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.Black,
            focusedBorderColor = Color(0xFFdd4f91),
            focusedLabelColor = Color(0xFFdd4f91),
            unfocusedBorderColor = Color.Transparent
        )
    )
}