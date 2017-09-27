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

public class Mineral extends AppCompatActivity {
    Button m1,m2,m4,m5,m6,m7,m8;
    final Context context=this;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.mineral);
        m1= (Button) findViewById(R.id.m1);
        m2= (Button) findViewById(R.id.m2);

        m4= (Button) findViewById(R.id.m4);
        m5= (Button) findViewById(R.id.m5);
        m6= (Button) findViewById(R.id.m6);
        m7= (Button) findViewById(R.id.m7);
        m8= (Button) findViewById(R.id.m8);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M1.class);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M2.class);
                startActivity(intent);
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M4.class);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M5.class);
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M6.class);
                startActivity(intent);
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M7.class);
                startActivity(intent);
            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,M8.class);
                startActivity(intent);
            }
        });

    }
}