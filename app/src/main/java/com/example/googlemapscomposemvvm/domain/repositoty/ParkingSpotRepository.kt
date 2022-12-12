package com.example.googlemapscomposemvvm.domain.repositoty

import com.example.googlemapscomposemvvm.domain.model.Parkingspot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository {
    suspend fun insertParkingspot(spot: Parkingspot)
    suspend fun deleteParkingspot(spot: Parkingspot)
    fun getParkingSpots(): Flow<List<Parkingspot>>
}