package com.anil.geologyofpune;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ANIL on 23/09/2017.
 */

public class Home extends AppCompatActivity {
    final Context context=this;
    Button intro,lava,area,gallery,mineral,about;
    @Override
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.home);

        intro= (Button) findViewById(R.id.intro);
        lava= (Button) findViewById(R.id.lava);
        area= (Button) findViewById(R.id.area);
        gallery= (Button) findViewById(R.id.gallery);;
        mineral= (Button) findViewById(R.id.minerals);
        about= (Button) findViewById(R.id.about);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Intro.class);
                startActivity(intent);
            }
        });
        lava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Lava.class);
                startActivity(intent);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Area.class);
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Gallery.class);
                startActivity(intent);
            }
        });
        mineral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Mineral.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,About.class);
                startActivity(intent);
            }
        });

    }
   }
