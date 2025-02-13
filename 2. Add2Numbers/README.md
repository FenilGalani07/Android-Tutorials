# Add 2 Numbers Android App

This is a simple Android application that takes two numbers as input from the user, adds them, and displays the sum when the button is clicked. It demonstrates how to use **EditText** for user input, **Button** for triggering actions, and **TextView** to display the output. Additionally, the app uses **Edge-to-Edge** design and handles window insets properly to avoid content being hidden behind system bars.

---

## Features

- **User Input**: Allows users to input two numbers using `EditText`.
- **Sum Calculation**: Adds the two numbers and displays the result in a `TextView`.
- **Edge-to-Edge Support**: Ensures the app UI fits within the system UI area with proper padding.
- **Simple UI**: Contains basic Android UI components like `Button`, `EditText`, and `TextView`.

## Prerequisites

- **Android Studio** installed on your computer.
- **Basic knowledge of Android development**, including Views, Button Clicks, and Event Handling.

---

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/bhagchandaniniraj/android-tutorials.git
   ```

2. Open the project in **Android Studio**.

3. Run the project on an Android Emulator or a physical Android device.

4. Enter two numbers in the input fields and press the **Submit** button to see the sum.

---

## How It Works

1. **EditText for User Input**: 
    - The user can enter two integers in the `EditText` fields.
  
2. **Button Click**: 
    - When the button is clicked, the values from the `EditText` fields are fetched.
    - The integers are then added, and the result is displayed in a `TextView`.

3. **Edge-to-Edge Support**:
    - The app uses `EdgeToEdge.enable(this)` to enable the edge-to-edge design, ensuring that UI elements don’t overlap with the system bars (e.g., status bar, navigation bar).
    - **Insets** are applied to the root layout to ensure proper padding.

4. **Display Sum**:
    - After performing the addition, the sum is displayed in the `TextView` as `Sum : <result>`.

---

## Code Explanation

### 1. MainActivity.java

The main activity consists of the logic for capturing user input, performing the addition operation, and displaying the result.

```java
EditText e1, e2;
Button btn;
TextView t;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;
    });
}

public void setOnClickButton(View view) {
    e1 = findViewById(R.id.et_n1);
    e2 = findViewById(R.id.et_n2);
    t = findViewById(R.id.txt);
    btn = findViewById(R.id.btn_submit);
    
    int n1 = Integer.parseInt(e1.getText().toString());
    int n2 = Integer.parseInt(e2.getText().toString());
    int sum = n1 + n2;
    String str = "Sum : " + sum;
    
    btn.setOnClickListener(v -> t.setText(str));
}
```

### 2. Edge-to-Edge Design

The following lines of code ensure that the UI adjusts for system bars:

```java
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
    return insets;
});
```

---

## Dependencies

- Android SDK 30 or higher for compatibility with **Edge-to-Edge** and **WindowInsetsCompat**.
- Java/Kotlin programming language support for development.
  
---

## How to Contribute

Feel free to fork this repository, make changes, and submit a pull request! 🛠️

## Author

- **Name**: Niraj Bhagchandani
- **GitHub**: [https://github.com/bhagchandaniniraj/android-tutorials](https://github.com/bhagchandaniniraj/android-tutorials)
- **Contact**: [bhagchandani.niraj@gmail.com](mailto:bhagchandani.niraj@gmail.com)


## Conclusion

This is a beginner-friendly Android application that demonstrates basic user input handling, calculations, and UI management with Android's `EditText`, `Button`, and `TextView`. It’s a great way to learn how to handle user interactions and make simple applications that perform tasks like basic arithmetic.

---

Hope this helps! If you have any questions, feel free to reach out! Happy coding! 🎉
