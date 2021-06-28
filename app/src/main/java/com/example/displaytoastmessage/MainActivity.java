package com.example.displaytoastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.Btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button one clicked",Toast.LENGTH_SHORT).show();
            }
        });

        // for button 2
        btn2=findViewById(R.id.Btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button two clicked",Toast.LENGTH_SHORT).show();
            }
        });

        //for button 3
        btn3=findViewById(R.id.Btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Toast.makeText(MainActivity.this,"Button three clicked",Toast.LENGTH_SHORT).show();
//               Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//               startActivity(intent); //this will show notification and go to next page
           }
        });
    }
}