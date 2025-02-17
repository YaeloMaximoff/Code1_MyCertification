package com.example.mycertificate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycertificate.ui.theme.MyCertificateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCertificateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        "Luis Yael Garcia Marquez",
                        48,
                        "Afinación de motores a gasolina",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre: String, number: Int, course: String,modifier: Modifier = Modifier){

    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Image(
                painter = painterResource(id = R.drawable.logo_unam),
                contentDescription = "Logo de UNAM",
                modifier = modifier.size(50.dp,50.dp),
                alpha = 0.3F,
            )
            Spacer(modifier = modifier.width(10.dp))
            Text(
                text = "Universidad Nacional Autónoma de México",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.align(Alignment.CenterVertically)
            )
            Spacer(modifier = modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.escudo_fi),
                contentDescription = "Logo de FI",
                modifier = modifier.size(50.dp,50.dp),
                alpha = 0.3F,
            )
        }
        Box (
            modifier =
                modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.logo_por),
                contentDescription = "Logo de Certificado",
                modifier = modifier.fillMaxWidth(),
                alpha = 0.3F,
            )
            Text(
                text = "This certificate is presented to:",
                fontSize = 15.sp,
                modifier = modifier.offset(y=-40.dp)
            )
            Text(
                text = nombre,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.
                fillMaxWidth()
            )
        }
        Text(
            text = "has successfully completed a $number hours course on",
            textAlign = TextAlign.Center,
            modifier = modifier.
            fillMaxWidth()
        )
        Text(
            text = "$course\n",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.offset(y=20.dp)
        )
        Row(
            modifier = modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Box(
                modifier = modifier,
                contentAlignment = Alignment.BottomCenter
            ){
                Image(
                    painter = painterResource(id = R.drawable.firma_uno),
                    contentDescription = "firma uno",
                    modifier = modifier.size(70.dp,50.dp)
                )
                Text(
                    text = "Antonio Jimenez Loza",
                    fontSize = 13.sp
                )
            }
            Spacer(modifier = modifier.width(130.dp))
            Box(
                modifier = modifier,
                contentAlignment = Alignment.BottomCenter
            ){
                Image(
                    painter = painterResource(id = R.drawable.firma_dos),
                    contentDescription = "firma dos",
                    modifier = modifier.size(70.dp,50.dp)
                )
                Text(
                    text = "Juan Pérez Cruz",
                    fontSize = 13.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CertificatingCourse (){
    CertificatingCourse("Luis Yael Garcia Marquez",48, "Afinación de motores a gasolina")
}

