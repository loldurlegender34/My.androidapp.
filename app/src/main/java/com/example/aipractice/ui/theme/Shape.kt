package com.example.aipractice.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Material 3 Expressive Shapes (More pronounced curves)
val ExpressiveShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(20.dp), // More expressive medium
    large = RoundedCornerShape(32.dp),  // Rounded large containers
    extraLarge = RoundedCornerShape(48.dp)
)
