<p align="center">
  <img src="https://lh3.googleusercontent.com/pk7M6-XiZz_-gRA6JYn221xg1asAan5Jmgwz6uJR5FCAxSkHqZbNkd0E8FLDI81K-hY=w3072-h1446-rw" alt="Example app design" width="300" height="whatever">
</p>

# Table of Contents
1. [Summary](#summary)
2. [Requirements](#requirements)
3. [Set-Up](#set-up)
4. [Resources for Learning](#resources-for-learning)

# Summary
Rutgers employs a company called Transloc to track buses and calculate arrival estimates. Your assignment for winter break is to develop an Android app that communicates with the [Transloc API](https://rapidapi.com/transloc/api/openapi-1-2/) and displays a list of stops for a Rutgers bus route along with arrival estimates for each stop.

The point of this assignment is to make you reinforce some of the skills that we have been teaching and also to make you learn how to learn on your own. This assignment may require you to do things that you haven't learned before. You should do your best to learn how to develop this app on your own, but if you get stuck don't hesitate to ask a question in the Android slack channel or contact Sean and/or Hemanth directly. This document will provide some recommended learning resources but remember that Google and StackOverflow are your best friends.

# Requirements
* Your app just needs to show a list of predictions for one route. You can choose any route but keep in mind that most routes won't have any predictions since it's winter break. Make sure to test your app with an actively running route! According to Rutgers, the All Campuses route will be active until January 2nd and after that the Weekend 1 and Weekend 2 routes will be active.
	* Note: The `is_active` property for the [Routes endpoint](https://rapidapi.com/transloc/api/openapi-1-2?endpoint=53aa596ae4b0f2c975470c11) isn't working properly and will tell you that an inactive route is active.
* Your app should use [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview) and not ListView.
* All network requests should be done asychronously.
* Your app should show a list of stop names, not stop IDs (this is a little tricky)

# Set-Up
### Getting access to Transloc
The [Transloc API](https://rapidapi.com/transloc/api/openapi-1-2/) is  accessed through an API markeplace called [RapidAPI](https://rapidapi.com/). RapidAPI is a platform that manages other companies' APIs for them. Transloc requires that you have an API key to make requests to their API. You'll need to create a RapidAPI account to get this key.

Once you've made an account and are logged in, follow these steps to get your API key:

1. Go to the [RapidAPI dashboard](https://dashboard.rapidapi.com/profile)
2. If there is nothing listed under "My Apps" in the left menu, then click "Add New App" and then click the green "Add" button on the right. Give your new app a name (it doesn't matter what) and then click the blue "Add" button. Now your new app should appear under "My Apps"
3. Click on an app to expand it into a dropdown. Then click "Security" from that dropdown list. A box with the title "App Credentials" will appear on the right.
4. Click the blue "SHOW" button to show your API key.

### Making API Requests With Your Key
The base url you'll be making your requests with is `
https://transloc-api-1-2.p.rapidapi.com/
`

For each request that you make, RapidAPI expects you to send your API key in the request header. Basically, the request header is a list of data. Each item of data has a name and a value and is visually represented like this: `NAME: VALUE`. You'll want to include this item of data in your request header:

`X-Mashape-Key: YOUR_API_KEY`

# Resources for Learning
* Googling to find an article or StackOverflow post that solves your problem is an important skill for a developer to have!
* The official [Android Developer Guides](https://developer.android.com/guide/) is an amazing resource. You should start browsing/reading this in your free time if you haven't already!
	* Here's the official [RecyclerView Guide](https://developer.android.com/guide/topics/ui/layout/recyclerview)
* [Future Studio](https://futurestud.io/) has a great [Retrofit guide](https://futurestud.io/tutorials/retrofit-getting-started-and-android-client) and also has a [GSON guide](https://futurestud.io/tutorials/gson-getting-started-with-java-json-serialization-deserialization) that is probably good too.
