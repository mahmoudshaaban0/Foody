package com.mahmoudshaaban.foody.ui.theme

import android.widget.RatingBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gowtham.ratingbar.RatingBar
import com.gowtham.ratingbar.RatingBarStyle


@Composable
fun PlacesCard(placesCard: placesCard) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = androidx.compose.ui.Modifier.shadow(10.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = placesCard.recImg1),
                contentDescription = "${placesCard.recName1} Image",
                contentScale = ContentScale.Crop,
                modifier = androidx.compose.ui.Modifier
                    .height(135.dp)
                    .width(360.dp)
            )

            Text(
                text = placesCard.recName1, style = MaterialTheme.typography.body2,
                modifier = androidx.compose.ui.Modifier.padding(top = 5.dp, start = 6.dp)
            )

            Text(
                text = placesCard.recLocation,
                style = MaterialTheme.typography.body1,
                color = Color(0xFFDDE2D9),
                fontSize = 11.sp,
                modifier = androidx.compose.ui.Modifier.padding(
                    start = 6.dp, top = 1.dp
                )
            )


        }
    }
}

@Preview
@Composable
private fun PreviewFoodsCard() {
    FoodyTheme(darkTheme = false) {
        PlacesCard(placesCard = placesCardItem.first())
    }
}
