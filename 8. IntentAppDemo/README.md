# IntentAppDemo in Android

## Overview

The IntentAppDemo project showcases the use of Intents in Android applications. Intents are a fundamental component of Android that allow communication between different components of the application, such as activities, services, and broadcast receivers. This demo illustrates how to use explicit and implicit intents to navigate between activities and pass data.

## Features

- **Explicit Intents**: Navigate between activities within the same application.
- **Implicit Intents**: Launch activities from other applications, such as viewing a webpage or sending an email.
- **Data Passing**: Demonstrates how to pass data between activities using intents.
- **User  Interaction**: Provides buttons for users to trigger different intents, enhancing interactivity.

## Code Structure

### XML Layout (activity_main.xml)

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <Button
        android:id="@+id/explicitIntentButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Open Second Activity" />

    <Button
        android:id="@+id/implicitIntentButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Open Web Page" />
</LinearLayout>
```

### Main Activity (MainActivity.java)

```java
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button explicitIntentButton = findViewById(R.id.explicitIntentButton);
        Button implicitIntentButton = findViewById(R.id.implicitIntentButton);

        explicitIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        implicitIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.example.com"));
                startActivity(intent);
            }
        });
    }
}
```

### Second Activity (SecondActivity.java)

```java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
```

## Usage

1. Clone the repository from GitHub:

```bash
git clone https://github.com/fenilgalani07/android-tutorials.git
```

2. Open the project in Android Studio.
3. Build and run the application on an Android device or emulator.
4. Click the "Open Second Activity" button to navigate to the second activity.
5. Click the "Open Web Page" button to launch a web browser with the specified URL.

## Author

- **Name**:Fenil Galani
- **GitHub**: [fenilgalani07](https://github.com/fenilgalani07/android-tutorials.git)

## License

This project is open-source and available under the [MIT License](LICENSE).
