package ui

import android.view.View
import com.example.shiv07tiwari.domain.Location
import com.example.shiv07tiwari.usecases.GetLocations
import com.example.shiv07tiwari.usecases.RequestNewLocation

class MainPresenter(
    private var view: View?,
    private val getLocations: GetLocations,
    private val requestNewLocation: RequestNewLocation
) {
    interface View {
        fun renderLocations(locations: List<Location>)
    }

    fun onCreate()  {
        val locations = getLocations()
        view?.renderLocations(locations)
    }

    fun newLocationClicked()  {
        val locations = requestNewLocation()
        view?.renderLocations(locations)
    }

    fun onDestroy() {
        view = null
    }

}