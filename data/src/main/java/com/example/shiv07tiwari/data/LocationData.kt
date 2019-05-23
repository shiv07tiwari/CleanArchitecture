package com.example.shiv07tiwari.data

import com.example.shiv07tiwari.domain.Location

class LocationData(
    private val locationPersistenceSource: LocationPersistenceSource,
    private val deviceLocationSource: DeviceLocationSource) {


    fun getSavedLocations(): List<Location> = locationPersistenceSource.getPersistedLocations()

    fun requestNewLocation(): List<Location> {
        val newLocation = deviceLocationSource.getDeviceLocation()
        locationPersistenceSource.saveNewLocation(newLocation)
        return getSavedLocations()
    }

    interface LocationPersistenceSource {

        fun getPersistedLocations(): List<Location>
        fun saveNewLocation(location: Location)

    }

    interface DeviceLocationSource {

        fun getDeviceLocation(): Location

    }
}