package com.mahmoudshaaban.foody.ui.theme

import com.mahmoudshaaban.foody.R


data class CardsItem(
    val recImg : Int ,
    val recName : String ,
    val recLocation : String ,
    val recRating : Float ,
    val recPrice : String
)

data class placesCard(
    val recImg1 : Int ,
    val recName1 : String ,
    val recLocation : String ,
)

val foodsCardItem = listOf(
    CardsItem(
        R.drawable.card1,
        "Chrispy Chicken Sandwich",
        "KoreanBBQ" ,
        4.5F ,
        "$25"
    ),
    CardsItem(
        R.drawable.card2,
        "Prawn & Chicken Roll",
        "KoreanBBQ" ,
        3.5F ,
        "$30"
    ),
    CardsItem(
        R.drawable.card3,
        "Spicy & Sour Clams",
        "KoreanBBQ" ,
        4F ,
        "$48"
    ),
)

val placesCardItem = listOf(
    placesCard(
        R.drawable.card1 ,
        "Kerridge's Bar & Grill" ,
        "10 Northumberland Avenue, Whitehall, London, WC2N 5AE"
    ) ,
    placesCard(
        R.drawable.card2 ,
        "Pollen Street Social",
        "8-10 Pollen Street, London, W1S 1NQ"
    ) ,
    placesCard(
        R.drawable.card3,
        "Sabor: The Counter" ,
        "35 Heddon Street, Mayfair, London, W1B 4BS"
    )
)