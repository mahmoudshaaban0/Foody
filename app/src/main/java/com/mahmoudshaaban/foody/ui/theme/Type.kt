package com.mahmoudshaaban.foody.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mahmoudshaaban.foody.R

private val SfUiDisplayBold = FontFamily(Font(R.font.sf_ui_display_bold_))
private val SfUiDisplayMedium = FontFamily(Font(R.font.sf_ui_display_medium))
private val SfUiDisplayLight = FontFamily(Font(R.font.sf_ui_display_light_))
private val SfUiDisplaySemiBold = FontFamily(Font(R.font.sf_ui_dispaly_semibold))


val Typography = Typography(
    h1 = TextStyle(
        fontFamily = SfUiDisplayBold,
        fontSize = 48.sp
    ),
    h2 = TextStyle(
        fontFamily = SfUiDisplayBold,
        fontSize = 36.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = SfUiDisplayMedium,
        fontSize = 18.sp
    ),
    body1 = TextStyle(
        fontFamily = SfUiDisplayLight,
        fontSize = 18.sp ,
    ),

    body2 = TextStyle(
        fontFamily = SfUiDisplaySemiBold,
        fontSize = 12.sp
    ),

    button = TextStyle(
        fontFamily = SfUiDisplayMedium ,
        fontSize = 16.sp ,
    )

)