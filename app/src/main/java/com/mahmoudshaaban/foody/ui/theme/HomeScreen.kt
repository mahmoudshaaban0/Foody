package com.mahmoudshaaban.foody.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoudshaaban.foody.R


@Composable
fun HomeScreen() {
    Surface(
        color = MaterialTheme.colors.surface,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Surface(
                color = Color(0xFFF52D56), modifier = Modifier
                    .height(142.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp).copy(
                    topStart = ZeroCornerSize,
                    topEnd = ZeroCornerSize
                )
            ) {
                Column() {


                    Text(
                        text = "Browse",
                        style = MaterialTheme.typography.h2,
                        color = Color.White,
                        modifier = Modifier.padding(start = 20.dp, top = 16.dp)
                    )
                    

                    var textChanged by remember {
                        mutableStateOf("")
                    }


                    TextField(
                        value = textChanged,
                        onValueChange = {
                            textChanged = it
                        }, label = { Text(text = "Search") },
                        maxLines = 1 ,
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = CircleShape)
                            .padding(horizontal = 20.dp)
                            .align(CenterHorizontally),
                        shape = RoundedCornerShape(20.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(

                            textColor = Color.Black,
                            backgroundColor = Color.White,
                            focusedBorderColor = Color.White,
                            disabledLabelColor = Color.White,
                            focusedLabelColor = Color.White,
                            unfocusedBorderColor = Color.White,

                            )


                    )




                }




/*     Text(text = "Trending this week",
color = Color.Black ,
style = MaterialTheme.typography.h2 , fontSize = 18.sp ,
modifier = Modifier.padding(top = 35.dp , start = 12.dp))

Spacer(modifier = Modifier.height(11.dp))

LazyRow(
horizontalArrangement = Arrangement.spacedBy(20.dp),) {
items(foodsCardItem) { item ->
FoodsCard(cardsItem = item)

}

}*/


            }

            Column() {


                Text(
                    text = "Trending this week",
                    color = Color.Black,
                    style = MaterialTheme.typography.h2, fontSize = 18.sp,
                    modifier = Modifier.padding(top = 159.dp, start = 12.dp)
                )
                Spacer(modifier = Modifier.height(11.dp))

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),) {
                    items(foodsCardItem) { item ->
                        FoodsCard(cardsItem = item)

                    }
                }

                Text(
                    text = "Most Popular",
                    color = Color.Black,
                    style = MaterialTheme.typography.h2, fontSize = 18.sp,
                    modifier = Modifier.padding(top = 12.55.dp, start = 12.dp)
                )
                
                Spacer(modifier = Modifier.height(23.dp))

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(20.dp),modifier = Modifier.align(CenterHorizontally)) {
                    items(placesCardItem) { item ->
                        PlacesCard(placesCard = item)

                    }
                }



            }


        }
    }


}

@Composable
private fun FoodsCardSection(themes: List<CardsItem>) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.horizontalScroll(rememberScrollState())
    ) {
        themes.forEach { themes ->
            FoodsCard(cardsItem = themes)

        }

    }
}


@Preview
@Composable
private fun PreviewHomeScreen() {
    FoodyTheme(darkTheme = false) {
        HomeScreen()
    }
}