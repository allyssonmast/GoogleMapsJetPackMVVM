package com.example.googlemapscomposemvvm.presentation

import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties=MapProperties(
        isIndoorEnabled = true,
    ),
    val isFalloutMap: Boolean = false
)
