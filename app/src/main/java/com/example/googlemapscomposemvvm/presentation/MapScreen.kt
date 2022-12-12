package com.example.googlemapscomposemvvm.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapUiSettings


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(
    mapsViewModel: MapsViewModel= viewModel()
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val uiSettings = remember {
        MapUiSettings(zoomControlsEnabled = false)
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    mapsViewModel.onEvent(MapEvent.ToggleFalloutMap)
                }
            ) {
                Icon(imageVector = if (mapsViewModel.state.isFalloutMap){
                    Icons.Default.LocationOn } else Icons.Default.Close,
                    contentDescription = "Toogle Fallout Map ")
            }
        },
    ) { paddingValues ->
        GoogleMap(
            modifier = Modifier.padding(paddingValues),
            properties = mapsViewModel.state.properties,
            uiSettings = uiSettings,
            onMapLongClick = {

            }
        ) {

        }

    }
}
