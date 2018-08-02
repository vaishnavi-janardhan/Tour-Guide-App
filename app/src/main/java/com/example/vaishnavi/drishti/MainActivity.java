package com.example.vaishnavi.drishti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView mangaluruTextView = findViewById(R.id.mangaluru_text_view);

        TextView udupiTextView = findViewById(R.id.udupi_text_view);


        mangaluruTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MangaluruActivity.class);
                startActivity(intent);
            }
        });


        udupiTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UdupiActivity.class);
                startActivity(intent);
            }
        });
    }
}
