# Google Maps App

This is a mobile app for saving and viewing locations on a map. The app is built using Kotlin and Jetpack Compose.

##Features

- Save locations on a map
- View saved locations on a map
- Edit and delete saved locations

# Architecture

The app uses Clean Architecture, MVVM, Hilt, and Room.

## Layers:

## Presentation layer: responsible for rendering the UI and receiving user input. This layer is built using Jetpack Compose and follows the MVVM pattern.
## Domain layer: responsible for business logic and use cases. This layer uses Clean Architecture principles to ensure testability and maintainability.
## Data layer: responsible for data retrieval and caching. This layer uses Room for storing location data locally.

# Getting Started

To run the app, follow these steps:

- Clone the repository
- Open the project in Android Studio
- Build and run the app


# Libraries Used

- Jetpack Compose for building the UI
- Hilt for dependency injection
- Room for local data storage
