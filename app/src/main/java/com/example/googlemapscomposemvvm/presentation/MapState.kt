package com.example.googlemapscomposemvvm.presentation

import com.example.googlemapscomposemvvm.domain.model.Parkingspot
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties=MapProperties(
        isIndoorEnabled = true,
    ),
    val parkingSpots: List<Parkingspot> = emptyList(),
    val isFalloutMap: Boolean = false
)
