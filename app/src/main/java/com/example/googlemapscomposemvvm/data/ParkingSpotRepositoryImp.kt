package com.example.googlemapscomposemvvm.data

import com.example.googlemapscomposemvvm.domain.model.Parkingspot
import com.example.googlemapscomposemvvm.domain.repositoty.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImp(
    private val dao: ParkingDao
):ParkingSpotRepository {
    override suspend fun insertParkingspot(spot: Parkingspot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingspot(spot: Parkingspot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<Parkingspot>> {
        return dao.getParkingSpots().map { spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}