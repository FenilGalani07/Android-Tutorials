# AlertDialogDemo in Android

## Overview

This project demonstrates the implementation of an AlertDialog in an Android application. The AlertDialog is a powerful UI component that allows developers to display important information to users and prompt them for decisions. This demo showcases how to create and customize AlertDialogs for various use cases, enhancing user interaction and experience.

## Features

- **Customizable AlertDialog**: Create AlertDialogs with custom titles, messages, and buttons.
- **Multiple Button Options**: Implement positive, negative, and neutral buttons to handle user responses.
- **Input Dialogs**: Capture user input through dialog prompts.
- **Interactive UI**: Provides a seamless and interactive experience for users.

## Code Structure

### XML Layout (activity_main.xml)

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <Button
        android:id="@+id/showDialogButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show Alert Dialog" />
</LinearLayout>
```

### Main Activity (MainActivity.java)

```java
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogButton = findViewById(R.id.showDialogButton);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Dialog")
                .setMessage("This is an example of an AlertDialog.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
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
4. Click the "Show Alert Dialog" button to display the AlertDialog.

## Author

- **Name**: Bhagchandani Niraj
- **GitHub**: [bhagchandaniniraj](https://github.com/bhagchandaniniraj/android-tutorials.git)

## License

This project is open-source and available under the [MIT License](LICENSE).
