package com.example.shiv07tiwari.usecases

import com.example.shiv07tiwari.data.LocationData
import com.example.shiv07tiwari.domain.Location

class GetLocations (
    private val locationData : LocationData
) {
    operator fun invoke(): List<Location> = locationData.getSavedLocations()

}