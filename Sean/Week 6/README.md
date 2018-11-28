## What we did
We decided to review network requests with `Retrofit` before moving onto `RecyclerView` to avoid any confusion. We began setting up a project that uses the Transloc OpenAPI to print out a list of Rutgers busses to LogCat. The app isn't functional yet.

## What we covered
* Review of using Gradle to handle dependencies
  - In our case, Retrofit, GSON, and the Retrofit-GSON converter are dependencies we need
* Review of networking concepts
* Giving our app permission to use the internet
* Setting up data classes
  - In our case, we made a `Route` class that represents a bus route
  - We also made a `RoutesResponse` class that represents all the parent JSON objects that hold the route information (because the array of routes in JSON was nested under multiple objects, we need to convert everything down to the array of routes)
* Setting up an interface that defines the endpoints we will be using (we named it `TranslocService`)

## Material for Others
* Here is the [Transloc api](https://rapidapi.com/transloc/api/OpenAPI%201.2) we're using (you will need to make an account with RapidAPI)
