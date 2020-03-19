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

    public void twoActivities(View view) {
        Intent intent = new Intent(MainActivity.this, TwoActivities.class);
        startActivity(intent);
    }

    public void implicitIntents(View view) {
        Intent intent = new Intent(MainActivity.this, ImplicitIntent.class);
        startActivity(intent);
    }

    public void receiveIntent(View view) {
        Intent intent = new Intent(MainActivity.this, IntentReceiver.class);
        startActivity(intent);
    }

    public void clickImage(View view) {
        Intent intent = new Intent (this, ClickableImages.class);
        startActivity(intent);
    }

    public void menusAndPickers(View view) {
        Intent intent = new Intent (this, MenuPicker.class);
        startActivity(intent);
    }

    public void contextMenu(View view) {
        Intent intent = new Intent (this, ContextMenuScrollingText.class);
        startActivity(intent);
    }

    public void alertDialog(View view) {
        Intent intent = new Intent(this, DialogAlert.class);
        startActivity(intent);
    }

    public void datePicker(View view) {
        Intent intent = new Intent(this, DatePicker.class);
        startActivity(intent);
    }
}
