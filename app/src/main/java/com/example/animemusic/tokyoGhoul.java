package com.example.animemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tokyoGhoul extends AppCompatActivity {

    private Button pause, resume, previous, next;
    MediaPlayer tokyoghoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyo_ghoul);

        tokyoghoul=MediaPlayer.create(tokyoGhoul.this,R.raw.song);
        tokyoghoul.start();
        pause=findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(tokyoGhoul.this,"Paused",Toast.LENGTH_SHORT).show();
                onPause();
            }
        });

        //for resume
        resume=findViewById(R.id.resume);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(tokyoGhoul.this,"Resumed",Toast.LENGTH_SHORT).show();
                onRestart();
            }
        });

        //next page
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(tokyoGhoul.this,"Attack On Titan",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(tokyoGhoul.this,attackOnTitan.class);
                startActivity(intent);
            }
        });

        //previous page
        previous=findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(tokyoGhoul.this,"Home Page",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(tokyoGhoul.this,AudioActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        tokyoghoul.pause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tokyoghoul.start();
    }
}