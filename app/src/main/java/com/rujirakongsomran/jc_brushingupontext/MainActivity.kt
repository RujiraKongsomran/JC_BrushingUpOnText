package com.rujirakongsomran.jc_brushingupontext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_brushingupontext.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_BrushingUpOnTextTheme {
                BrushWithTextField()
            }
        }
    }
}

class ScaledThirdBrush(val shaderBrush: ShaderBrush) : ShaderBrush() {
    override fun createShader(size: Size): Shader {
        return shaderBrush.createShader(size = size / 3f)
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun CreateRepeatingColor() {
    val gradientColors = listOf(GradientColor7, GradientColor8, GradientColor9)
    Text(
        text = "Sometimes hurt is needed to make us grow,\n" +
                "Failure is needed to make us know \n" +
                "And loss is needed to make us gain.\n" +
                "Because life's greatest lessons are\n" +
                "Usually taught through a little bit of pain.",
        style = TextStyle(
            brush = ScaledThirdBrush(
                Brush.linearGradient(
                    colors = gradientColors,
                    tileMode = TileMode.Repeated
                ) as ShaderBrush
            )
        ),
        modifier = Modifier.padding(8.dp)
    )
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun TileModeParam() {
    val gradientColors = listOf(GradientColor7, GradientColor8, GradientColor9)

    Column(
        modifier = Modifier
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Sometimes hurt is needed to make us grow,\n" +
                    "Failure is needed to make us know \n" +
                    "And loss is needed to make us gain.\n" +
                    "Because life's greatest lessons are\n" +
                    "Usually taught through a little bit of pain.",
            style = TextStyle(
                brush = ScaledThirdBrush(
                    Brush.linearGradient(
                        colors = gradientColors,
                        tileMode = TileMode.Repeated
                    ) as ShaderBrush
                )
            ),
        )

        Text(
            text = "Sometimes hurt is needed to make us grow,\n" +
                    "Failure is needed to make us know \n" +
                    "And loss is needed to make us gain.\n" +
                    "Because life's greatest lessons are\n" +
                    "Usually taught through a little bit of pain.",
            style = TextStyle(
                brush = ScaledThirdBrush(
                    Brush.linearGradient(
                        colors = gradientColors,
                        tileMode = TileMode.Mirror
                    ) as ShaderBrush
                )
            ),
        )

        Text(
            text = "Sometimes hurt is needed to make us grow,\n" +
                    "Failure is needed to make us know \n" +
                    "And loss is needed to make us gain.\n" +
                    "Because life's greatest lessons are\n" +
                    "Usually taught through a little bit of pain.",
            style = TextStyle(
                brush = ScaledThirdBrush(
                    Brush.linearGradient(
                        colors = gradientColors,
                        tileMode = TileMode.Clamp
                    ) as ShaderBrush
                )
            ),
        )

        Text(
            text = "Sometimes hurt is needed to make us grow,\n" +
                    "Failure is needed to make us know \n" +
                    "And loss is needed to make us gain.\n" +
                    "Because life's greatest lessons are\n" +
                    "Usually taught through a little bit of pain.",
            style = TextStyle(
                brush = ScaledThirdBrush(
                    Brush.linearGradient(
                        colors = gradientColors,
                        tileMode = TileMode.Decal
                    ) as ShaderBrush
                )
            ),
        )
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

@OptIn(ExperimentalTextApi::class)
@Composable
fun CreateSolidColor() {
    Text(
        text = "Do not allow what you cannot do,\n" +
                "Interfere with what you can do.\n" +
                "You can reach your dreams faster\n" +
                "Doing things you're good at.",
        style = TextStyle(
            brush = SolidColor(GradientColor1)
        ),
        modifier = Modifier.padding(8.dp)
    )
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun BrushWithTextField() {
    val gradientColors = listOf(GradientColor7, GradientColor8, GradientColor9)
    var text by remember { mutableStateOf("") }
    val brush = remember {
        Brush.linearGradient(
            colors = gradientColors
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = {
                Text(text = "Enter Your Name")
            },
            textStyle = TextStyle(brush = brush)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_BrushingUpOnTextTheme {
        BrushWithTextField()
    }
}