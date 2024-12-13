package com.ao.hukissy.ui.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowOutward
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.SimCard
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RecentCall() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.Black),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = "Kahilo",
                modifier = Modifier,
                color = Color.White,
                fontSize = 20.sp,
            )

            Row {
                Icon(
                    imageVector = Icons.Filled.SimCard,
                    contentDescription = "Ícone de SIM Card",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.Filled.ArrowOutward,
                    contentDescription = "ArrowOutward",
                    tint = Color.Red
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Telemóvel",
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(180.dp))
                Text(
                    text = "Data",
                    color = Color.White,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(imageVector = Icons.Outlined.Info, contentDescription = "Info", tint = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun preview() {
    //Surface(
       // modifier = Modifier.fillMaxSize(),
        //contentColor = contentColorFor(Color.White),
    //) {
        RecentCall()
    //}
}