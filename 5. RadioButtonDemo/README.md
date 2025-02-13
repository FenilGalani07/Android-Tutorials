# RadioButton Demo Android App

Welcome to the **RadioButton Demo** Android app! 🔘

This app demonstrates how to use **RadioButtons** in Android. RadioButtons allow users to select one option from a set of mutually exclusive options, making it perfect for scenarios where only one choice can be made from a predefined list.

The app also implements **Edge-to-Edge** design to ensure a modern user interface, fitting content seamlessly within the system UI.

---

## Features

- **RadioButton Interaction**: Allows users to choose between multiple options (although the actual RadioButton functionality is not implemented in this demo, you can add it).
- **Edge-to-Edge Design**: Ensures that UI components fit correctly with the screen's system bars (e.g., status bar, navigation bar).
- **Basic Layout**: Demonstrates the usage of `RadioButtons` and the necessary UI setup for a typical form or selection screen.

---

## Prerequisites

Before getting started, ensure that you have the following installed:

- **Android Studio** (latest version recommended).
- Basic understanding of Android UI components such as **RadioButtons**, **Layouts**, and handling system UI elements.

---

## Getting Started

### Step 1: Clone the Repository

To clone the repository to your local machine, run the following command:

```bash
git clone https://github.com/bhagchandaniniraj/android-tutorials.git
```

### Step 2: Open the Project in Android Studio

1. Open **Android Studio**.
2. Select **File > Open** and choose the folder you just cloned.
3. Wait for Android Studio to sync with Gradle.

### Step 3: Run the Project

1. Connect an Android device or use an emulator.
2. Click on the **Run** button in Android Studio (or press **Shift + F10**).
3. The app will launch on your device/emulator with a layout ready to accept RadioButton selections.

---

## How It Works

### 1. **RadioButton Setup**

In this app, we have the basic setup of a **RadioButton** in a layout file (`activity_main.xml`). Typically, you would add the `RadioGroup` container and multiple `RadioButton` options inside it.

For example:

```xml
<RadioGroup
    android:id="@+id/radioGroup"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    
    <RadioButton
        android:id="@+id/radioOption1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Option 1" />

    <RadioButton
        android:id="@+id/radioOption2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Option 2" />
</RadioGroup>
```

### 2. **Edge-to-Edge Design**

The app uses **Edge-to-Edge** design for modern UI layouts. This ensures that the content fills the entire screen without overlapping system UI components (status bar, navigation bar).

This is achieved by calling `EdgeToEdge.enable(this)` and applying padding to the layout using the `ViewCompat.setOnApplyWindowInsetsListener()` method.

```java
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
    return insets;
});
```

This ensures that the UI is displayed properly without any elements being hidden under the system bars.

---

## Code Walkthrough

### MainActivity.java

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // Enable Edge-to-Edge design
        setContentView(R.layout.activity_main);

        // Apply padding to account for system bars (status bar, navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
```

### XML Layout (activity_main.xml)

In this demo, the layout is expected to have basic **RadioButton** options inside a `RadioGroup`, allowing the user to select only one option at a time.

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:id="@+id/main">

    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
        
        <RadioButton
            android:id="@+id/radioOption1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 1" />
        
        <RadioButton
            android:id="@+id/radioOption2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 2" />
    </RadioGroup>
</LinearLayout>
```

You can add more RadioButtons inside the `RadioGroup` as needed.

---

## Dependencies

- **Android SDK** version 30 or higher.
- Java (or Kotlin) programming language for development.

---

## How to Contribute

We welcome contributions to improve this app! 🎉

If you have ideas for new features, enhancements, or bug fixes, feel free to:

1. Fork the repository.
2. Make changes or add features.
3. Submit a pull request with a description of your changes.

---

## Author

- **Name**: Niraj Bhagchandani
- **GitHub**: [https://github.com/bhagchandaniniraj/android-tutorials](https://github.com/bhagchandaniniraj/android-tutorials)
- **Contact**: [bhagchandani.niraj@gmail.com](mailto:bhagchandani.niraj@gmail.com)


## Conclusion

This **RadioButton Demo** app is a simple yet effective way to learn about working with **RadioButtons** and handling **Edge-to-Edge** design in Android. You can extend this app to include actual functionality by implementing listeners for the RadioButtons and adding additional interactions, such as submitting the selected choice or updating the UI dynamically.

Thank you for exploring this demo! 🚀 Happy coding! 🎉
