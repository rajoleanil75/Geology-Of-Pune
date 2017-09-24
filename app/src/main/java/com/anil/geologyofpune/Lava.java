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

public class Lava extends AppCompatActivity {
    final Context context=this;
    Button lava1,lava2;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.lava);
        lava1= (Button) findViewById(R.id.lava1);
        lava2= (Button) findViewById(R.id.lava2);
        lava1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Lava1.class);
                startActivity(intent);
            }
        });
        lava2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Lava2.class);
                startActivity(intent);
            }
        });
    }
}
