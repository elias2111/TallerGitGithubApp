package co.edu.unab.elias.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.elias.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGitGithubAppTheme {
                ejercicioEnclase()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ejercicioEnclase() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1C1C28)),
        contentAlignment = Alignment.Center
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight(0.9f),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val painter = painterResource(R.drawable.fotot)

                Image(
                    painter = painter,
                    contentDescription = "fotot",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                )

                Text(
                    text = "Jose Elias",
                    fontSize = 28.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "Ing. Sistemas",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 6.dp),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(24.dp))

                Divider()

                Spacer(modifier = Modifier.height(16.dp))

                InfoRow("EDAD", "20 años")
                InfoRow("CORREO", "jose@email.com")
                InfoRow("CIUDAD", "Bucaramanga")

                Spacer(modifier = Modifier.height(20.dp))

                Divider()

                Spacer(modifier = Modifier.height(16.dp))

            }
        }
    }
}

@Composable
fun InfoRow(titulo: String, valor: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {
        Text(titulo, fontSize = 12.sp, color = Color.Gray)
        Text(valor, fontSize = 16.sp, fontWeight = FontWeight.Medium)
        Divider()
    }
}