Overview
--------

This Android application demonstrates the usage of CheckBox components in an Android project. The app allows users to select different colors (Red, Green, and Blue) using checkboxes and displays the selected options via Toast messages and updates the UI accordingly.

Features:
---------

*   Checkboxes for selecting colors: Red, Green, and Blue.
    
*   A button that displays the state of the checkboxes (checked or unchecked).
    
*   Toast messages are shown when checkboxes are selected or deselected.
    
*   The app uses EdgeToEdge layout to enable edge-to-edge rendering on supported devices.
    

Prerequisites
-------------

*   Android Studio
    
*   Android SDK (API level 21 or higher recommended)
    

Setup Instructions
------------------

1.  **Clone the repository** or download the ZIP file from the [GitHub repository](https://github.com/bhagchandaniniraj/android-tutorials/tree/main/CheckBoxDemo).
    
2.  **Open the project in Android Studio**:
    
    *   Open Android Studio.
        
    *   Select **Open an existing project** and navigate to the directory where the project is located.
        
    *   Wait for the project to sync and Gradle build to finish.
        
3.  **Run the app**:
    
    *   Connect your Android device or use an emulator.
        
    *   Click **Run** in Android Studio to launch the application.
        

Code Explanation
----------------

### MainActivity.java

The MainActivity.java file handles the logic of the CheckBox selections and button click. Here's a breakdown of the functionality:

*   **CheckBox Selection Handlers**: The onCheckBoxClick() method defines the OnClickListener for each CheckBox. When a checkbox is checked or unchecked, a Toast is displayed to notify the user of the selection.
    
*   **Button Click**: When the button is clicked, the states of the checkboxes (Red, Green, Blue) are concatenated into a string and displayed in a TextView. The same string is also displayed as a Toast message, and the output is logged in the system console.
    
*   **Edge-to-Edge Rendering**: The EdgeToEdge.enable(this) method is used to enable edge-to-edge rendering for modern devices with large screen sizes.
    

### Layout (activity\_main.xml)

The XML layout file defines the UI components:

*   Three CheckBox elements for selecting colors (Red, Green, Blue).
    
*   A Button to trigger the display of selected colors.
    
*   A TextView to show the current state of selected colors.
    

### Dependencies

*   **AndroidX Libraries**: The app uses AndroidX libraries such as AppCompatActivity, ViewCompat, and WindowInsetsCompat for compatibility across different Android versions.
    

Screenshots
-----------

Here are some screenshots of the application:

- **Snapshot 1**  
![Snapshot-1](https://github.com/bhagchandaniniraj/android-tutorials/raw/main/CheckBoxDemo/snapshots/Snapshot-1.png)

- **Snapshot 2**  
![Snapshot-2](https://github.com/bhagchandaniniraj/android-tutorials/raw/main/CheckBoxDemo/snapshots/Snapshot-2.jpg)

 
 ## Author

- **Name**: Niraj Bhagchandani
- **GitHub**: [https://github.com/bhagchandaniniraj/android-tutorials](https://github.com/bhagchandaniniraj/android-tutorials)
- **Contact**: [bhagchandani.niraj@gmail.com](mailto:bhagchandani.niraj@gmail.com)

-------

This project is licensed under the MIT License.

Feel free to modify and extend this application as per your needs. If you find any bugs or need improvements, please submit an issue or a pull request.
