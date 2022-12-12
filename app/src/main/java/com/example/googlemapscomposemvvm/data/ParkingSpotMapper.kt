package com.example.googlemapscomposemvvm.data

import com.example.googlemapscomposemvvm.domain.model.Parkingspot

fun ParkingSpotEntity.toParkingSpot(): Parkingspot{
    return Parkingspot(
        lat=lat,
        lng=lng,
        id=id
    )
}
fun Parkingspot.toParkingSpotEntity(): ParkingSpotEntity{
    return ParkingSpotEntity(
        lat=lat,
        lng=lng,
        id=id
    )
}