package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }


    public void toastView(View view) {
        Intent intent = new Intent(MainActivity.this, ToastActivity.class);
        startActivity(intent);
    }

    public void scrollingView(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollingText.class);
        startActivity(intent);
    }

    public void helpYourself(View view) {
        Intent intent = new Intent(MainActivity.this, HelpYourself.class);
        startActivity(intent);
    }
}
