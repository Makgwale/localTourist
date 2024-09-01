Local Tourist App
Overview
The Local Tourist app is an Android application designed to help users explore local landmarks and manage their travel preferences. It features integration with Google Maps for location services and offers various functionalities to enhance the user experience.

Features
Explore Landmarks: Discover nearby landmarks and points of interest.
Current Location: View your current location on a map.
Offline Maps: Access maps and landmarks without an internet connection.
Favorite Landmarks: Save and view your favorite landmarks.
Saved Landmarks: Manage and view landmarks you’ve saved.
Prerequisites
Android Studio or IntelliJ IDEA (with Android support)
Java Development Kit (JDK) 8 or higher
Android SDK 33 or higher
Installation
Clone the Repository

bash
Copy code
git clone https://github.com/yourusername/localTourist.git
Open the Project

Open the project in IntelliJ IDEA or Android Studio.

Sync Gradle

In IntelliJ IDEA or Android Studio, click on Sync Project with Gradle Files to ensure all dependencies are correctly downloaded.

Build the Project

In IntelliJ IDEA: Go to Build > Rebuild Project.
In Android Studio: Go to Build > Rebuild Project.
Run the Application

Connect an Android device or start an emulator. Click the Run button in IntelliJ IDEA or Android Studio to install and run the app on your device.

Configuration
API Key: To use Google Maps functionalities, you need to obtain an API key from the Google Cloud Console. Place the API key in res/values/google_maps_api.xml.

Permissions: Ensure you have the required permissions in AndroidManifest.xml:

xml
Copy code
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.INTERNET" />
Minimum SDK Version: This project requires a minimum SDK version of 21. Update your build.gradle if necessary:

gradle
Copy code
android {
    compileSdkVersion 34
    defaultConfig {
        minSdkVersion 21
        targetSdkVersion 34
    }
}
Usage
Navigate to Preferences: Access preferences from the options menu to customize your app settings.
View Offline Maps: Download and view maps offline for easier navigation.
Save and View Favorites: Save landmarks to your favorites for quick access.
Troubleshooting
Build Errors: Ensure that all dependencies are correctly configured and Gradle is synced. Check the console for specific error messages and follow the provided suggestions.
Manifest Merging Issues: Update your minSdkVersion to match or exceed the requirements of your dependencies.
Contributing
If you would like to contribute to the development of this app, please fork the repository, make your changes, and submit a pull request. For detailed contribution guidelines, refer to CONTRIBUTING.md (if available).

License
This project is licensed under the MIT License. See the LICENSE file for details.
