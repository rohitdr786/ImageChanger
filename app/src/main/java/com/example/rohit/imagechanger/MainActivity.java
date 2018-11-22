package com.example.rohit.imagechanger;

import android.graphics.drawable.DrawableWrapper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImageFunction(View view) {
        ImageView img=findViewById(R.id.imageView);
        img.setImageResource(R.drawable.conan2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
