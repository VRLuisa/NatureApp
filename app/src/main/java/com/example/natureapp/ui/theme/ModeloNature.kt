package com.example.natureapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

data class LugarNatural(
    val nombre: String,
    val descripcion: String,
    val imagenUrl: String
)

val lugaresNaturales = listOf(
    LugarNatural(
        "Cavernas de Mármol",
        "Formaciones minerales formadas por carbonato de calcio, erosionadas durante años por las aguas del lago.",
        "https://i0.wp.com/roamandthrive.com/wp-content/uploads/2021/01/DSC_3271-1-1150x768.jpg"
    ),
    LugarNatural(
        "Cataratas de Sangre",
        "En el este de la Antártida, su origen se atribuyó a la abundancia de óxido de hierro.",
        "https://media.a24.com/p/11aa5ef2fd6ff33dd4991235285687f9/adjuntos/296/imagenes/009/324/0009324167/1200x675/smart/cataratas-sangre-5jpg.jpg"
    ),
    LugarNatural(
        "Caño Cristales",
        "En el fondo se reproducen algas que producen la sensación de que el agua del río es de varios colores.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQO6LQQf8wIvfaPqa0x2PH2w6xV3Ha2sCIwpQ&s"
    ),
    LugarNatural(
        "Lago Natrón",
        "Es un lago salado de una belleza casi irreal, pero de aguas corrosivas que provocan quemaduras mortales.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQ4zBPmKo1s0ULJ_JJOMF4Cvi21ug14U-GzA&s"
    ),
    LugarNatural(
        "Salar de Uyuni",
        "En la época de lluvias, el salar se convierte en un gigantesco espejo y el cielo es imposible de distinguir de la tierra.",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGcEZAV8OSgocYSLVR4v0T9uzN7A5cpwhfig&s"
    )
)

@Composable
fun LugarNaturalCard(lugarNatural: LugarNatural) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            AsyncImage(
                model = lugarNatural.imagenUrl,
                contentDescription = lugarNatural.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = lugarNatural.nombre,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = lugarNatural.descripcion,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
