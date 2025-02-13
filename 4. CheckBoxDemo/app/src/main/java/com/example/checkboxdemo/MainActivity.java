package com.example.checkboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CheckBox red, blue, green;
    Button b;
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
        setOnClickListener();
        onCheckBoxClick();
    }
    public void onCheckBoxClick(){
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this,"Red Color Selected",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Red Color De-Selected",Toast.LENGTH_LONG).show();
                }
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()) {
                    Toast.makeText(MainActivity.this, "Green Color Selected", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Green Color De-Selected", Toast.LENGTH_LONG).show();
                }
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(MainActivity.this, "Blue Color Selected", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Blue Color De-selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void setOnClickListener(){
        red = (CheckBox) findViewById(R.id.cb_red);
        blue = (CheckBox) findViewById(R.id.cb_blue);
        green = (CheckBox) findViewById(R.id.cb_green);
        t = (TextView) findViewById(R.id.text_t);
        b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                sb.append("\nRed: ").append(red.isChecked());
                sb.append("\nGreen: ").append(green.isChecked());
                sb.append("\nBlue: ").append(blue.isChecked());
                t.setText("\nSelected - " + sb.toString());
                Toast.makeText(MainActivity.this,sb.toString(),Toast.LENGTH_LONG).show();
                System.out.println(sb.toString());
            }
        });
    }
}