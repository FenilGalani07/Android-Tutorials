package com.example.loginpagedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    int count=5;
    TextView attempts;
    Button btn;
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
        logMeIn();
    }
    public void logMeIn(){
        user = (EditText) findViewById(R.id.et_user);
        pass = (EditText) findViewById(R.id.et_pass);
        btn = (Button) findViewById(R.id.button);
        attempts = (TextView) findViewById(R.id.attempts);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("niraj") &&
                        pass.getText().toString().equals("123.5")){
                    Intent intent = new Intent(".LoggedInActivity");
                    Toast.makeText(MainActivity.this,"Loggin Successful...",
                            Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else{
                    if(--count <=0){
                        btn.setEnabled(false);
                    }
                    attempts.setText("Count Attempts " + count);
                    Toast.makeText(MainActivity.this,"Invalid Username or Password...",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}