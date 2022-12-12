package com.example.googlemapscomposemvvm.di

import android.app.Application
import androidx.room.Room
import com.example.googlemapscomposemvvm.data.ParkingSpotDatabase
import com.example.googlemapscomposemvvm.data.ParkingSpotRepositoryImp
import com.example.googlemapscomposemvvm.domain.repositoty.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app:Application):ParkingSpotDatabase{
        return Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "Parking_spots.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db:ParkingSpotDatabase):ParkingSpotRepository{
        return ParkingSpotRepositoryImp(db.dao)
    }
}