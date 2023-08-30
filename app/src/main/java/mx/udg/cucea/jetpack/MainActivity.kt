package mx.udg.cucea.jetpack

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.udg.cucea.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ventanaPrincipal()

        }
    }
    @Composable
    fun ventanaPrincipal(){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = R.mipmap.udg),
                contentDescription = "imagen del android"
            )
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ){
                Text(stringResource(R.string.encabezado))
                Text(stringResource(R.string.cucea), color = Color.Blue)
                Spacer(modifier = Modifier.height(100.dp))
                Text(stringResource(R.string.saludo), color = Color.Green)


            }
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(
                    stringResource(R.string.clic)
                )
            }
        }


    }


    @Preview(showBackground = true)
    @Composable
    fun vistaPrevia(){
        ventanaPrincipal()
    }
    @Preview(showSystemUi = true)
    @Composable
    fun vistaPrevia2(){
        ventanaPrincipal()
    }
}
