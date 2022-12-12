package com.example.googlemapscomposemvvm.presentation

import com.example.googlemapscomposemvvm.domain.model.Parkingspot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent{
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng):MapEvent()
    data class OnInfoWindowLongClick(val spot: Parkingspot):MapEvent()

}
