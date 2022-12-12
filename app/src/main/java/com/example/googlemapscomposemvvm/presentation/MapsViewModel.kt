package com.example.googlemapscomposemvvm.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.googlemapscomposemvvm.domain.repositoty.ParkingSpotRepository
import com.google.android.gms.maps.model.MapStyleOptions
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(
    private val repository: ParkingSpotRepository
): ViewModel() {
    var state by mutableStateOf(MapState())

    fun onEvent(event: MapEvent){
        when(event){
            is MapEvent.ToggleFalloutMap -> {
                state = state.copy(
                    properties = state.properties.copy(
                        mapStyleOptions = if(state.isFalloutMap) null
                                else MapStyleOptions(MapStyle.json),
                        ),
                    isFalloutMap = !state.isFalloutMap
                )
            }
        }
    }
}