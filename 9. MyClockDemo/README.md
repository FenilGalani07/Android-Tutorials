# MyClockDemo in Android

## Overview

The MyClockDemo project is an Android application that showcases a simple yet effective clock interface. This application allows users to view the current time and date, demonstrating the use of Android's UI components and time management features. The project is designed to be interactive and user-friendly, providing a seamless experience for users.

## Features

- **Current Time Display**: Shows the current time in a user-friendly format.
- **Date Display**: Displays the current date alongside the time.
- **Customizable UI**: Easily customizable layout to fit different themes and styles.
- **Responsive Design**: Adapts to various screen sizes and orientations.

## Code Structure

### XML Layout (activity_main.xml)

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="16dp">

    <TextView
        android:id="@+id/timeTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="48sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/dateTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="24sp" />
</LinearLayout>
```

### Main Activity (MainActivity.java)

```java
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView timeTextView;
    private TextView dateTextView;
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeTextView = findViewById(R.id.timeTextView);
        dateTextView = findViewById(R.id.dateTextView);

        updateTime();
    }

    private void updateTime() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String currentTime = new SimpleDateFormat("hh:mm:ss a", Locale.getDefault()).format(new Date());
                String currentDate = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.getDefault()).format(new Date());
                timeTextView.setText(currentTime);
                dateTextView.setText(currentDate);
                handler.postDelayed(this, 1000); // Update every second
            }
        };
        handler.post(runnable);
    }
}
```

## Usage

1. Clone the repository from GitHub:

```bash
git clone https://github.com/bhagchandaniniraj/android-tutorials.git
```

2. Open the project in Android Studio.
3. Build and run the application on an Android device or emulator.
4. Observe the current time and date displayed on the screen, which updates every second.

## Author

- **Name**: Bhagchandani Niraj
- **GitHub**: [bhagchandaniniraj](https://github.com/bhagchandaniniraj/android-tutorials.git)

## License

This project is open-source and available under the [MIT License](LICENSE).
