package com.example.no2_vp_week2.soal1


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.Pause
import androidx.compose.ui.Alignment
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.unit.sp
import com.example.no2_vp_week2.R
import com.example.no2_vp_week2.ui.theme.No2_VP_Week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            No2_VP_Week2Theme {
                LaguTulus()
            }
        }
    }
}

@Composable
fun LaguTulus(modifier : Modifier = Modifier){
    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = Color(0xFF1565C0)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 40.dp)
                .fillMaxHeight()
        ){
          Row(
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(top = 24.dp, bottom = 8.dp),
              horizontalArrangement = Arrangement.SpaceBetween,
              verticalAlignment = Alignment.CenterVertically
          ) {
              IconButton(onClick = {}){
                  Icon(
                      imageVector = Icons.Default.KeyboardArrowDown,
                      contentDescription = "Tutup"
                  )
              }
              Text(
                  text = "Liked Songs",
                  style = MaterialTheme.typography.titleMedium,
                  color = Color.White,
                  fontWeight = FontWeight.Bold
              )
              IconButton(onClick = {}){
                  Icon(
                      imageVector = Icons.Default.MoreHoriz,
                      contentDescription = "Menu"
                  )
              }
          }
            AlbumTulus(
                modifier = Modifier.padding(top = 16.dp)
            )
            JudulLagu(
                modifier = Modifier.padding(top = 24.dp)
            )
            ProgressLagu(
                modifier = Modifier.padding(top = 24.dp)
            )
            PlayerControls(
                modifier = Modifier.padding(top = 8.dp)
            )
            LirikLagu(
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 8.dp)
            )
        }
    }
}

@Composable
fun AlbumTulus(modifier : Modifier = Modifier){
    Column(
        modifier = modifier
    ){
        Image(
            painter = painterResource(id = R.drawable.jatuhsuka),
            contentDescription = "jatuhsuka",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .border(
                    width = 3.dp,
                    color = Color.White,
                    shape  = RoundedCornerShape(5.dp)
                )
        )

    }
}

@Composable
fun JudulLagu(modifier : Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column {
            Text(
                text = "Jatuh Suka",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Tulus",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )
        }
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite",
                tint = Color.White,
                modifier = Modifier
                    .size(35.dp)
            )
        }
    }
}

@Composable
fun ProgressLagu(modifier : Modifier){
    Column(
        modifier = modifier
            .fillMaxWidth()
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Black)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "0:12",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Black
            )
            Text(
                text = "-2:14",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Black
            )
        }
    }
}

@Composable
fun PlayerControls(modifier : Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(onClick = {}){
            Icon(
                imageVector = Icons.Default.SkipPrevious,
                contentDescription = "Previous",
                tint = Color.Black,
                modifier = Modifier.size(36.dp)
            )
        }
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ){
            IconButton(onClick = {}){
                Icon(
                    imageVector = Icons.Default.Pause,
                    contentDescription = "Play/Pause",
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
        IconButton(onClick = {}){
            Icon(
                imageVector = Icons.Default.SkipNext,
                contentDescription = "Next",
                tint = Color.Black,
                modifier = Modifier.size(36.dp)
            )
        }
    }
}

@Composable
fun LirikLagu(modifier : Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .clip(
                RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp
                )
            )
            .background(Color(0xFFA9A9A9))
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ){
        Text(
            text = "Sungguh ku tidak memiliki daya\n" +
                    "Di depan harummu\n" +
                    "Sungguh terkunci kata yang tertata\n" +
                    "Di depan ragamu\n" +
                    "Hu\n" +
                    "Bila kau lihat ku tanpa sengaja\n" +
                    "Beginikah surga\n" +
                    "Bayangkan bila kau ajakku bicara\n" +
                    "Ini semua bukan salahmu\n" +
                    "Punya magis perekat yang sekuat itu\n" +
                    "Dari lahir sudah begitu\n" +
                    "Maafkan\n" +
                    "Aku jatuh suka\n" +
                    "Bila kau lihat ku tanpa sengaja\n" +
                    "Hu\n" +
                    "Beginikah surga\n" +
                    "Bayangkan bila kau ajakku bicara\n" +
                    "Ini semua bukan salahmu\n" +
                    "Punya magis perekat yang sekuat itu\n" +
                    "Dari lahir sudah begitu\n" +
                    "Maafkan\n" +
                    "Aku jatuh suka\n" +
                    "Bila kau berkenan biarkanku di sampingmu\n" +
                    "Berkuranglah satu jiwa yang sepi\n" +
                    "Ini semua bukan salahmu\n" +
                    "Punya magis perekat yang sekuat itu\n" +
                    "Dari lahir sudah begitu\n" +
                    "Maafkan oh uh\n" +
                    "Ini semua bukan salahmu\n" +
                    "Punya magis perekat yang sekuat itu\n" +
                    "Dari lahir sudah begitu\n" +
                    "Maafkan\n" +
                    "Aku jatuh suka hm\n" +
                    "Aku jatuh suka",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black.copy(alpha = 0.85f),
            lineHeight = 28.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LaguTulusPreview() {
    No2_VP_Week2Theme {
        LaguTulus()
    }
}