package ru.mirea.rulev.multiactivity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text1 = (String) getIntent().getSerializableExtra("key");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text1);
        String text2 = (String) getIntent().getSerializableExtra("bruh");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(text2);
        Log.i(TAG, "onCreate2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart2");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause2");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy2");
    }
}