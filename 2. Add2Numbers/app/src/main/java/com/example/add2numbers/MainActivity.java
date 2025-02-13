package com.example.add2numbers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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

    public void setOnClickButton(View view){
        e1 = (EditText) findViewById(R.id.et_n1);
        e2 = (EditText) findViewById(R.id.et_n2);
        t = (TextView) findViewById(R.id.txt);
        btn = (Button) findViewById(R.id.btn_submit);
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int sum = n1 + n2;
        String str = "Sum : " + sum;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(str);
            }
        });
    }
}