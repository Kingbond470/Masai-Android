package com.example.animemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fairyTail extends AppCompatActivity {

    private Button pause,resume, next, previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairy_tail);

        pause=findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(fairyTail.this,"Paused",Toast.LENGTH_SHORT).show();
            }
        });

        //for resume
        resume=findViewById(R.id.resume);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(fairyTail.this,"Resumed",Toast.LENGTH_SHORT).show();
            }
        });

        //next page
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(fairyTail.this,"Death Note",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(fairyTail.this,deathNote.class);
                startActivity(intent);
            }
        });

        //previous page
        previous=findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(fairyTail.this,"naruto",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(fairyTail.this,naruto.class);
                startActivity(intent);
            }
        });

    }
}