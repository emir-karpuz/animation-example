package com.example.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean flag = true;

    public void fadePhoto (View view) {

//        ImageView panterImageView = (ImageView) findViewById(R.id.panterImageView);

//        if (flag) {
//            flag = false;
//            emirImageView.animate().alpha(0).setDuration(2000);
//            panterImageView.animate().alpha(1).setDuration(2000);
//
            Log.i("Info","emirImageView faded");
//        } else {
//            emirImageView.animate().alpha(1).setDuration(2000);
//            panterImageView.animate().alpha(0).setDuration(2000);
//        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageView emirImageView = (ImageView) findViewById(R.id.emirImageView);

        emirImageView.setX(-500);
        emirImageView.animate().alpha(1).scaleXBy(0.5f).scaleYBy(0.5f).rotationYBy(1800).translationXBy(500).setDuration(1000);
    }
}