package com.example.shiv07tiwari.cleanarchitecture.framework

import com.example.shiv07tiwari.data.LocationData
import com.example.shiv07tiwari.domain.Location

class GetPreviousLocations : LocationData.LocationPersistenceSource {

    private var locations: List<Location> = emptyList()

    override fun getPersistedLocations(): List<Location> = locations

    override fun saveNewLocation(location: Location) {
        locations += location
    }
}