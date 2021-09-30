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
fun FoodsCard(cardsItem: CardsItem) {
    Card(
        shape = MaterialTheme.shapes.medium ,
        modifier = androidx.compose.ui.Modifier.shadow(10.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = cardsItem.recImg),
                contentDescription = "${cardsItem.recName} Image",
                contentScale = ContentScale.Crop,
                modifier = androidx.compose.ui.Modifier
                    .height(113.dp)
                    .width(220.dp)
            )

            Text(text = cardsItem.recName , style = MaterialTheme.typography.body2 ,
            modifier = androidx.compose.ui.Modifier.padding(top = 5.dp, start = 6.dp))

            Text(
                text = cardsItem.recLocation,
                style = MaterialTheme.typography.body1,
                color = Color(0xFFDDE2D9),
                fontSize = 11.sp,
                modifier = androidx.compose.ui.Modifier.padding(
                    start = 6.dp, top = 1.dp
                )
            )

            Row(modifier = Modifier.padding(start = 6.dp)) {

                RatingBar(value = cardsItem.recRating , onRatingChanged = {}, onValueChange = {} ,
                    ratingBarStyle = RatingBarStyle.HighLighted ,
                    size = 9.dp )
                
                
                Text(text = cardsItem.recPrice,
                    style = MaterialTheme.typography.body2 ,
                 modifier = Modifier.padding(start = 122.dp , bottom = 6.dp))

            }







        }

    }
}

@Preview
@Composable
private fun PreviewFoodsCard() {
    FoodyTheme(darkTheme = false) {
        FoodsCard(cardsItem = foodsCardItem.first())
    }
}