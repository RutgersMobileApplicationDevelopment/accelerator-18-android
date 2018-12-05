## What we did
We finished our simple bus app that prints all the Rutgers bus routes to Logcat. The `BusApp` folder is the Android Studio project for the app. The code in `BusApp` uses an API key from RapidAPI that I generated, so you don't need to make your own. If `HttpLoggingIntercepter` is reporting an error of 401, then that means that the API key used in this project is no longer valid and that you need to replace it. Remember that the API key should included in the request header, which we did with the `@Header` annotation in `TranslocService.java`

## What we covered
* Fixing our data classes (because we made a few access-modifier errors last week)
* Creating a `Retrofit` object instance and an instance of `TranslocService`
* Reviewing the differences between sychronous and asynchronous
* Asynchronously calling `TranslocService.getRoutes()`
* Using `HttpLoggingInterceptor` to log Retrofit requests and responses to Logcat

## Material for Others
* Here is the [Transloc api](https://rapidapi.com/transloc/api/OpenAPI%201.2) we're using (you will need to make an account with RapidAPI if the API key in the project is invalid)
