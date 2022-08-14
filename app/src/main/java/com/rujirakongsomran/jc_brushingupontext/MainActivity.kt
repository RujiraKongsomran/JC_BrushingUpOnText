package com.rujirakongsomran.jc_brushingupontext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_brushingupontext.ui.theme.GradientColor1
import com.rujirakongsomran.jc_brushingupontext.ui.theme.GradientColor2
import com.rujirakongsomran.jc_brushingupontext.ui.theme.GradientColor3
import com.rujirakongsomran.jc_brushingupontext.ui.theme.JC_BrushingUpOnTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_BrushingUpOnTextTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}


@OptIn(ExperimentalTextApi::class)
@Composable
fun CreateDefaultBrushes() {
    val gradientColors = listOf(GradientColor1, GradientColor2, GradientColor3)

    Column(
        modifier = Modifier
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Do not allow what you cannot do,\n" +
                    "Interfere with what you can do.\n" +
                    "You can reach your dreams faster\n" +
                    "Doing things you're good at.",
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = gradientColors
                )
            ),
        )
        Text(
            text = "Do not allow what you cannot do,\n" +
                    "Interfere with what you can do.\n" +
                    "You can reach your dreams faster\n" +
                    "Doing things you're good at.",
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    colors = gradientColors
                )
            )
        )

        Text(
            text = "Do not allow what you cannot do,\n" +
                    "Interfere with what you can do.\n" +
                    "You can reach your dreams faster\n" +
                    "Doing things you're good at.",
            style = TextStyle(
                brush = Brush.verticalGradient(
                    colors = gradientColors
                )
            )
        )

        Text(
            text = "Do not allow what you cannot do,\n" +
                    "Interfere with what you can do.\n" +
                    "You can reach your dreams faster\n" +
                    "Doing things you're good at.",
            style = TextStyle(
                brush = Brush.radialGradient(
                    colors = gradientColors
                )
            )
        )

        Text(
            text = "Do not allow what you cannot do,\n" +
                    "Interfere with what you can do.\n" +
                    "You can reach your dreams faster\n" +
                    "Doing things you're good at.",
            style = TextStyle(
                brush = Brush.sweepGradient(
                    colors = gradientColors
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_BrushingUpOnTextTheme {
        CreateDefaultBrushes()
    }
}