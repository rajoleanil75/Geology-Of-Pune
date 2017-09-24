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

public class Area extends AppCompatActivity {
    final Context context=this;
    Button area1,area2,area3;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.area);
        area1= (Button) findViewById(R.id.area1);
        area2= (Button) findViewById(R.id.area2);
        area3= (Button) findViewById(R.id.area3);
        area1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Area1.class);
                startActivity(intent);
            }
        });
        area2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Area2.class);
                startActivity(intent);
            }
        });
        area3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Area3.class);
                startActivity(intent);
            }
        });
    }
}
