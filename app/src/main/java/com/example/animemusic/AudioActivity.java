package com.example.animemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AudioActivity extends AppCompatActivity {

    protected Button tk,aot,naruto,ft,dn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        tk=findViewById(R.id.tk);
        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AudioActivity.this,"Tokyo Ghoul",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(AudioActivity.this,tokyoGhoul.class);
                startActivity(intent);


            }
        });

        //for resume
        aot=findViewById(R.id.aot);
        aot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AudioActivity.this,"Attack On Titan",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(AudioActivity.this,attackOnTitan.class);
                startActivity(intent);
            }
        });

        //next page
        naruto=findViewById(R.id.naruto);
        naruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AudioActivity.this,"Naruto",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(AudioActivity.this,naruto.class);
                startActivity(intent);
            }
        });

        //fairy tail
        ft=findViewById(R.id.ft);
        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AudioActivity.this,"Fairy Tail",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(AudioActivity.this,fairyTail.class);
                startActivity(intent);
            }
        });

        // deathe note
        dn=findViewById(R.id.dn);
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AudioActivity.this,"Death Note",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(AudioActivity.this,deathNote.class);
                startActivity(intent);
            }
        });

    }
}