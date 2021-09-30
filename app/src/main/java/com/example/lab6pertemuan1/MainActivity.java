package com.example.lab6pertemuan1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.gambardariinternet);

        String url = "https://upload.wikimedia.org/wikipedia/commons/5/56/White_shark.jpg";

        Picasso.with(this).load(url).into(imageView);

    }
}