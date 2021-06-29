package com.example.eventlistenerswe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtvnewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      mtvnewText=findViewById(R.id.changeText);
      mtvnewText.setText("Welcome to Masai School");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key","Screen Rotated");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String str=savedInstanceState.getString("key");
        mtvnewText.setText(str);
    }
}