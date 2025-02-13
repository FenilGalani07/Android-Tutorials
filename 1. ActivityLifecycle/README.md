# Android Activity Lifecycle Demonstration

This repository contains an example Android application designed to showcase the **Activity Lifecycle** in Android development. The app demonstrates the various lifecycle methods that an activity undergoes, including `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, and `onDestroy()`. These methods are crucial for understanding how Android manages the lifecycle of an app and how developers can utilize these callbacks to manage resources and maintain a responsive app.

---

## Features

- **Lifecycle Awareness**: The project logs the execution of key lifecycle methods to help developers understand the order in which they are called.
- **Edge-to-Edge UI**: The application leverages modern Android UI components, enabling edge-to-edge support using the `EdgeToEdge` API, allowing the app to look visually appealing on modern devices.
- **System Bar Handling**: The project includes handling for system UI elements like the status bar and navigation bar, ensuring that the layout respects the screen's safe area and adjusts accordingly using `WindowInsetsCompat`.

---

## Project Overview

The main goal of this project is to help Android developers understand how the activity lifecycle works. The activity lifecycle refers to the series of states that an activity goes through as the user interacts with it. Android manages these states to optimize resource usage and ensure that the application behaves predictably and efficiently. Understanding these states is crucial for managing app resources, handling background processes, and providing a smooth user experience.

### Key Lifecycle Methods Demonstrated:

1. **onCreate(Bundle savedInstanceState)**: This method is called when the activity is first created. It is used to perform initial setup, such as initializing views, binding data, or setting up listeners.

2. **onStart()**: Called when the activity becomes visible to the user. This is where you might start tasks that require the activity to be visible, such as initializing animations or setting up components that interact with the UI.

3. **onResume()**: Called when the activity enters the foreground and is ready to interact with the user. This is where you would typically start tasks like resuming media playback or registering listeners.

4. **onPause()**: This method is called when the activity is about to lose focus, usually when a new activity is being launched or the user is moving to a different screen. Here, you would save any data that needs to be persisted or stop any tasks that shouldn’t continue when the activity is paused.

5. **onStop()**: Called when the activity is no longer visible. At this point, the activity should release resources or stop ongoing tasks to avoid unnecessary battery and memory usage.

6. **onDestroy()**: Called when the activity is being destroyed, either because the user is leaving the activity or the system is reclaiming resources. You should use this method to release any remaining resources or clean up operations.

---

## User Interface and Layout

The app uses the **Edge-to-Edge** feature, which ensures that the UI extends across the full screen, even beneath the system bars (such as the status bar or navigation bar) on modern Android devices. This creates a more immersive and modern-looking interface.

Additionally, the project implements **`WindowInsetsCompat`** to adjust the padding of the activity's main layout, ensuring that the system bars (like the status and navigation bars) don't overlap the app’s content, providing a smooth and user-friendly experience across different screen sizes and orientations.

---

## How to Use

1. **Clone the Repository**:  
   To get started with the project, clone the repository to your local machine using the following command:

   ```bash
   git clone https://github.com/yourusername/activitylifecycle.git
   ```

## How to Use

### Open in Android Studio:
To get started, open the project in **Android Studio**. This project is designed to work with the latest version of Android Studio and should run seamlessly on modern Android versions. If you are using an older version of Android Studio, consider updating it to avoid compatibility issues.

### Run the App:
Once the project is opened in Android Studio, you can run the app on a **physical Android device** or an **emulator**. To do this, select a device from the Android Studio toolbar and click the **Run** button. 

The app will launch on the chosen device, and you will be able to observe the lifecycle methods in action. These methods will be logged, and you can see them in the **Logcat window**.

### Observe Logcat:
While the app is running, open the **Logcat** window in Android Studio. Logcat will display messages for each lifecycle method that is triggered, such as:

- `onCreate()`
- `onStart()`
- `onResume()`
- `onPause()`
- `onStop()`
- `onDestroy()`

By observing these log outputs, you can track when each method is called as the app goes through different lifecycle stages. This is a great way to gain a deeper understanding of how Android handles activities and how you can manage resources effectively.

---

## Conclusion

This project serves as an excellent learning tool for **Android developers** who want to dive deeper into the **Activity Lifecycle**. By running this app and observing the log messages for each lifecycle method, you will gain valuable insight into the flow of an activity and how to manage various stages effectively.

Understanding the activity lifecycle is essential for building high-quality Android applications. It allows developers to:

- Manage app resources efficiently.
- Handle background services.
- React to configuration changes (e.g., device rotation).
- Optimize performance and battery usage.

By mastering the activity lifecycle, you can ensure that your app provides a seamless and responsive user experience.

---

## Author

- **Name**: Niraj Bhagchandani
- **GitHub**: [https://github.com/bhagchandaniniraj/android-tutorials](https://github.com/bhagchandaniniraj/android-tutorials)
- **Contact**: [bhagchandani.niraj@gmail.com](mailto:bhagchandani.niraj@gmail.com)

Feel free to reach out with any questions or feedback regarding the project!

---

## License

This project is licensed under the [MIT License](LICENSE).

