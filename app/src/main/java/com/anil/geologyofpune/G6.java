package com.anil.geologyofpune;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by ANIL on 25/09/2017.
 */

public class G6 extends AppCompatActivity {
    final Context context = this;
    Button h;
    ImageButton p, n;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.g6);
        p = (ImageButton) findViewById(R.id.p);
        h = (Button) findViewById(R.id.h);
        n = (ImageButton) findViewById(R.id.n);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, G5.class);
                startActivity(intent);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, G7.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Home.class);
                startActivity(intent);
            }
        });
    }
}
