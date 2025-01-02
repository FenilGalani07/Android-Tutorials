## Overview of Android Activity Lifecycle Demonstration

This project serves as an educational tool for Android developers to understand the **Activity Lifecycle** in Android applications. It showcases various lifecycle methods that an activity undergoes, including `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, and `onDestroy()`. Each of these methods plays a crucial role in managing resources and ensuring a responsive user experience.

## Key Features

- **Lifecycle Awareness**: The application logs the execution of key lifecycle methods, providing insights into the order in which they are called.
- **Edge-to-Edge UI**: Utilizes modern Android UI components to support edge-to-edge layouts, enhancing visual appeal on contemporary devices.
- **System Bar Handling**: Implements handling for system UI elements like the status bar and navigation bar, using `WindowInsetsCompat` to ensure content does not overlap with these elements.

## Understanding the Activity Lifecycle

The activity lifecycle refers to the series of states that an activity transitions through as users interact with it. Understanding these states is essential for optimizing resource usage and ensuring predictable application behavior. The key lifecycle methods include:

- **`onCreate(Bundle savedInstanceState)`**: Called when the activity is first created. This method is used for initial setup, such as initializing views and setting up listeners.
  
- **`onStart()`**: Invoked when the activity becomes visible to the user. This is where tasks that require visibility, like animations, should be started.
  
- **`onResume()`**: Triggered when the activity enters the foreground and is ready for user interaction. This is typically where media playback resumes.
  
- **`onPause()`**: Called when the activity is about to lose focus. Here, developers should save data or stop tasks that should not continue while the activity is paused.
  
- **`onStop()`**: Invoked when the activity is no longer visible. Resources should be released or ongoing tasks stopped to conserve battery and memory.
  
- **`onDestroy()`**: Called when the activity is being destroyed. This method is used to release any remaining resources or perform cleanup operations.

## User Interface and Layout

The app leverages the Edge-to-Edge feature to create a modern interface that extends across the full screen, including beneath system bars. This design approach ensures a seamless user experience across various screen sizes and orientations by adjusting layout padding with `WindowInsetsCompat`.

## How to Use

1. **Clone the Repository**:
   To get started, clone the repository using:
   ```bash
   git clone https://github.com/yourusername/activitylifecycle.git
   ```

2. **Open in Android Studio**:
   Open the cloned project in Android Studio. Ensure you are using a compatible version of Android Studio for optimal performance.

3. **Run the App**:
   Select a physical device or emulator from the toolbar and click the Run button to launch the app.

4. **Observe Logcat**:
   While running, open Logcat in Android Studio to view logs for each lifecycle method triggered during app execution.

## Conclusion

This project effectively demonstrates how to manage an Android application's activity lifecycle through practical implementation. By observing log outputs for each lifecycle method, developers can gain a deeper understanding of how Android manages activities and how to optimize resource management effectively.

Mastering these lifecycle methods is essential for building high-quality applications that provide a seamless user experience by efficiently managing resources, handling background processes, and reacting appropriately to configuration changes. 

### Author Information
- **Name**: Fenil Galani
- **GitHub**: [FenilGalani07](https://github.com/FenilGalani07/Android-Tutorials)
- **Contact**: fenilgalani123@gmail.com

Feel free to reach out with any questions or feedback regarding this project.
