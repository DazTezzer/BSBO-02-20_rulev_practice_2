package ru.mirea.rulev.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button(View view){
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);
        Toast toast = Toast.makeText(getApplicationContext(),
                String.format("«Рулев No 19 ГРУППА БСБО-02-20 Количество символов - %s ».",editText.getText().length()),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}