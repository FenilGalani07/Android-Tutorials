package com.example.ratingbardemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    RatingBar rb;
    TextView txt_view;
    Button btn_submit;

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
        listenerForRatingBar();
        onClickButtonListner();
    }
    public void onClickButtonListner(){
        rb = (RatingBar) findViewById(R.id.ratingBar);
        txt_view = (TextView) findViewById(R.id.txt);
        btn_submit = (Button) findViewById(R.id.button);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                float rating = rb.getRating();
//                String str = "Ratings are: "+ String.valueOf(rating);
                Toast.makeText(MainActivity.this,
                        "Ratings are: "+ String.valueOf(rb.getRating()),
                                    Toast.LENGTH_LONG).show();
            }
        });
    }
    public void listenerForRatingBar(){
        rb = (RatingBar) findViewById(R.id.ratingBar);
        txt_view = (TextView) findViewById(R.id.txt);
        btn_submit = (Button) findViewById(R.id.button);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //String str =  "Ratings are: "+ String.valueOf(rating) ;
                txt_view.setText("Ratings are: "+ String.valueOf(rating));
            }
        });
    }
}