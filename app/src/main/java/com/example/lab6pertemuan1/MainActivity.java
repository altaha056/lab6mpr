package com.example.lab6pertemuan1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_2);

        //declare variabel dari komponen imageview
        ImageView kotakGambar = findViewById(R.id.komponengambar);

        //declare url dari internet
        String urldariinternet = "https://upload.wikimedia.org/wikipedia/commons/2/24/Oceanic_Whitetip_Shark.png";

        //memasukkan gambar dari url ke komponen imageview
        Picasso.with(this).load(urldariinternet).into(kotakGambar);


        //variabel primitive: string, int, boolean
        //variabel reference: object



    }
}