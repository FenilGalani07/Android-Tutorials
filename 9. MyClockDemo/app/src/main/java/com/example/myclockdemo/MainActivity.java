package com.example.myclockdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextClock txtClock;
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
        onButtonClick();
    }
    public void onButtonClick(){
        btn = (Button) findViewById(R.id.button);
        txtClock = (TextClock) findViewById(R.id.textClock);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtClock.getVisibility() == TextClock.GONE){
                    txtClock.setVisibility(TextClock.VISIBLE);
                }else{
                    txtClock.setVisibility(TextClock.GONE);
                }
            }
        });
    }
}