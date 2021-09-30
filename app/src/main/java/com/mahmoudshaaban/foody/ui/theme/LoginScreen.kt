package com.mahmoudshaaban.foody.ui.theme

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mahmoudshaaban.foody.R

@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Column(
            Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                    )
                )
        ) {

            WelcomeBackTextField()
            SignInContinueText()
            EmailTextField()
            PasswordTextField()
            Spacer(modifier = Modifier.height(59.dp))
            LoginButton(navController)
            ForgetYourPasswordText()
            

        }
    }

}

@Composable
private fun ColumnScope.ForgetYourPasswordText() {
    Text(
        "Forget your password ?",
        color = Color.White,
        style = MaterialTheme.typography.button,
        modifier = Modifier.Companion
            .align(CenterHorizontally)
            .padding(top = 44.dp)
    )
}

@Composable
private fun ColumnScope.LoginButton(navController: NavController) {
    Button(
        onClick = { navController.navigate("Home") }, colors =
        ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.primary,
        ),
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .size(width = 284.dp, height = 52.dp)
            .align(CenterHorizontally)
    ) {

        Text(text = "Log in", style = MaterialTheme.typography.button)
    }
}

@Composable
private fun PasswordTextField() {
    var textChanged by remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 39.dp, end = 39.dp, top = 30.dp),
        singleLine = true,
        maxLines = 1,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation(),
        value = textChanged,
        onValueChange = { nextString ->
            textChanged = nextString
        },
        label = { Text(text = "Password", color = Color.White) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.White,
            focusedBorderColor = Color.White,
            disabledLabelColor = Color.White,
            focusedLabelColor = Color.White,
            unfocusedBorderColor = Color.White,

            )
    )
}

@Composable
private fun ColumnScope.WelcomeBackTextField() {
    Text(
        text = "Welcome Back", style = MaterialTheme.typography.h1,
        color = Color.White, modifier = Modifier
            .padding(top = 94.dp)
            .align(CenterHorizontally)
    )
}

@Composable
private fun EmailTextField() {
    var textChanged by remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 39.dp, end = 39.dp, top = 153.dp),
        singleLine = true,
        maxLines = 1,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        value = textChanged,
        onValueChange = { nextString ->
            textChanged = nextString
        },
        label = { Text(text = "User name", color = Color.White) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.White,
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color.White,
            disabledLabelColor = Color.White,
            focusedLabelColor = Color.White,

            )
    )
}

@Composable
private fun SignInContinueText() {
    Text(
        text = "Sign In to continue",
        style = MaterialTheme.typography.subtitle1,
        color = Color.White,
        modifier = Modifier
            .padding(start = 41.dp)
            .clickable(
                enabled = true,
                role = Role.Button
            ) {}
    )
}

@Preview
@Composable
private fun PreviewLoginScreen() {
    FoodyTheme(darkTheme = false) {
        LoginScreen(rememberNavController())
    }
}