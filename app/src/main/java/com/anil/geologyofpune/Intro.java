package com.anil.geologyofpune;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ANIL on 24/09/2017.
 */

public class Intro extends AppCompatActivity {
    final Context context=this;
    Button part1,part2,part3,part4,part5;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.intro);
        part1= (Button) findViewById(R.id.part1);
        part2= (Button) findViewById(R.id.part2);
        part3= (Button) findViewById(R.id.part3);
        part4= (Button) findViewById(R.id.part4);
        part5= (Button) findViewById(R.id.part5);
        part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Part1.class);
                startActivity(intent);
            }
        });
        part2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Part2.class);
                startActivity(intent);
            }
        });
        part3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Part3.class);
                startActivity(intent);
            }
        });
        part4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Part4.class);
                startActivity(intent);
            }
        });
        part5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Part5.class);
                startActivity(intent);
            }
        });

    }
}
