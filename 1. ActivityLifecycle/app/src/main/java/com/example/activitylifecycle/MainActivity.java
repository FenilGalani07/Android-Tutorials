package com.example.activitylifecycle;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String MY_MESSAGE = "Custom Message: ";
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
    protected void onStart(){
        super.onStart();
        Log.i(MY_MESSAGE,"onStart() method called");
    }
    protected void onResume(){
        super.onResume();
        Log.i(MY_MESSAGE,"onResume() method called");
    }
    protected void onPause(){
        super.onPause();
        Log.i(MY_MESSAGE,"onPause() method called");
    }
    protected void onStop(){
        super.onStop();
        Log.i(MY_MESSAGE,"onStop() method called");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(MY_MESSAGE,"onDestroy() method called");
    }

}