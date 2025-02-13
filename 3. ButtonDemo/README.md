# Button Demo Android App

Welcome to the **Button Demo** Android app! 🎉

This simple Android app demonstrates how to use buttons in Android to trigger actions like displaying **Toast** messages. The app showcases a basic interaction using a button and also implements **Edge-to-Edge** design for a modern user experience.

---

## Features

- **Button Interaction**: Displays a toast message when the button is clicked.
- **Edge-to-Edge Design**: Ensures your content is neatly displayed, taking into account the system bars (status bar and navigation bar).
- **Interactive UI**: Displays a friendly message to students when they click the button.


## Prerequisites

Before you start, make sure you have the following installed:

- **Android Studio** (latest version recommended).
- **Basic understanding of Android components** such as `Button`, `Toast`, and `OnClickListener`.

---

## Getting Started

### Step 1: Clone the Repository

To get started with this app, you can clone the repository by running the following command:

```bash
git clone https://github.com/bhagchandaniniraj/android-tutorials.git
```

### Step 2: Open the Project in Android Studio

1. Open **Android Studio**.
2. Select **File > Open** and choose the project folder you just cloned.
3. Wait for the Gradle sync to finish.

### Step 3: Run the Project

1. Connect an Android device or use an emulator.
2. Click on the **Run** button in Android Studio or press **Shift + F10** to launch the app.
3. The app will display a simple screen with a button.

### Step 4: Interact with the Button

1. Click the **Submit** button.
2. A **Toast message** will appear on the screen, saying:  
   `"Hello !!! 6th Semester Students"`.

---

## How It Works

### 1. **Button Action**

- The app contains a button (`Button btn`) that triggers an action when clicked. The action is handled by the `setOnClickListener()` method.
  
### 2. **Toast Message**

- When the button is clicked, a **Toast** message is displayed, which shows a short pop-up message on the screen. This helps provide feedback to the user.
  
  ```java
  Toast.makeText(MainActivity.this, 
      "Hello !!! 6th Semesster Students", 
      Toast.LENGTH_LONG).show();
  ```

### 3. **Edge-to-Edge Design**

- The app uses `EdgeToEdge.enable(this)` to implement an edge-to-edge layout, which ensures the UI extends from edge to edge, without being hidden behind system bars like the status bar or navigation bar.

### 4. **Padding for System Bars**

- Using `ViewCompat.setOnApplyWindowInsetsListener()`, the app dynamically adjusts the layout to provide proper padding for system bars, ensuring the UI is not overlapped by the system UI.

  ```java
  ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
      Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      return insets;
  });
  ```

---

## Code Walkthrough

### MainActivity.java

```java
public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // Enable Edge-to-Edge design
        setContentView(R.layout.activity_main);
        
        // Adjust padding for system bars (status bar, navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void hello6thSem(View view){
        btn = (Button) findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display Toast message when button is clicked
                Toast.makeText(MainActivity.this, "Hello !!! 6th Semesster Students", Toast.LENGTH_LONG).show();
                // Log message in console
                System.out.println("Hello !!! 6th Semesster Students");
            }
        });
    }
}
```

---

## Dependencies

- **Android SDK** version 30 or higher.
- Java (or Kotlin) programming language for development.
  
---

## How to Contribute

We welcome contributions to improve the app! 🎉

Here’s how you can contribute:
1. Fork this repository.
2. Make your changes or add new features.
3. Create a pull request with a description of your changes.


## Author

- **Name**: Niraj Bhagchandani
- **GitHub**: [https://github.com/bhagchandaniniraj/android-tutorials](https://github.com/bhagchandaniniraj/android-tutorials)
- **Contact**: [bhagchandani.niraj@gmail.com](mailto:bhagchandani.niraj@gmail.com)


## Conclusion

This **Button Demo** app is a great way to start learning Android development! You’ll understand basic components like buttons, handling user input, and displaying messages. As you continue exploring Android, you can build on this foundation to create more complex and interactive applications. 

---

Thank you for exploring this demo! Happy coding! 🎉🚀
