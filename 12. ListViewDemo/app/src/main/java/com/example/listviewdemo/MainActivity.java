package com.example.listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static ListView lv;
    String str[] = new String[] {"Tom", "Harry", "Potter", "Hermaine", "Ron Wisely", "Kalu Bhaiya"};
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
        myListView();
    }
    public void myListView(){
        lv = (ListView) findViewById(R.id.shoplist);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.mylistlayout,str);
        lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "Position: " + (position+1) + " Value: " + lv.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });


    }
}