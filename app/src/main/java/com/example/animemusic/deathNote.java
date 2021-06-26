package com.example.animemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class deathNote extends AppCompatActivity {

    private Button pause, resume, next, previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_note);

        pause=findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(deathNote.this,"Paused",Toast.LENGTH_SHORT).show();
            }
        });

        //for resume
        resume=findViewById(R.id.resume);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(deathNote.this,"Resumed",Toast.LENGTH_SHORT).show();
            }
        });

        //next page
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(deathNote.this,"Audio Player",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(deathNote.this, AudioActivity.class);
                startActivity(intent);
            }
        });

        //previous page
        previous=findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(deathNote.this,"Fairy Tail",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(deathNote.this,fairyTail.class);
                startActivity(intent);
            }
        });

    }
}