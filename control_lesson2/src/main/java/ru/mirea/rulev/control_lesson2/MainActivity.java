package ru.mirea.rulev.control_lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void snakbar(View view)
    {
        Snackbar.make(view, "Rulev BSBO-02-20", Snackbar.LENGTH_SHORT).show();
    }

    public void time_dialog(View view)
    {
        MyTimeDialogFragment dialog = new MyTimeDialogFragment(MainActivity.this);
    }

    public void date_dialog(View view)
    {
        MydateDialogFragment dialog = new MydateDialogFragment(MainActivity.this);
    }

    public void progres_dialog(View view)
    {
        MyProgresDialogFragment dialog = new MyProgresDialogFragment(MainActivity.this);
    }
}