package com.example.shiv07tiwari.cleanarchitecture.framework

import com.example.shiv07tiwari.data.LocationData
import com.example.shiv07tiwari.domain.Location

class GenerateNewLocation : LocationData.DeviceLocationSource {

    override fun getDeviceLocation(): Location =
        Location((Math.random()*180 - 90).toString(), (Math.random()*360 - 180).toString())
    }