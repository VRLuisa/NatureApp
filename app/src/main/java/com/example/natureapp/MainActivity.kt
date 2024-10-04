package com.example.natureapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.natureapp.ui.theme.LugarNaturalCard
import com.example.natureapp.ui.theme.NatureAppTheme
import com.example.natureapp.ui.theme.lugaresNaturales
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() 
        setContent {
            NatureAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(title = { Text("NatureApp") })
                    }
                ) { paddingValues ->
                    NatureApp(paddingValues = paddingValues)
                }
            }
        }
    }
}

@Composable
fun NatureApp(paddingValues: PaddingValues) {
    LazyColumn(
        contentPadding = paddingValues,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(lugaresNaturales) { lugar ->
            LugarNaturalCard(lugarNatural = lugar)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NatureAppTheme {
        NatureApp(paddingValues = PaddingValues(0.dp))
    }
}
