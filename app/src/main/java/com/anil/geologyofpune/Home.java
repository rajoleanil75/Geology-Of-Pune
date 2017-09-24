package com.anil.geologyofpune;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

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
                Intent intent=new Intent(context,Home.class);
                startActivity(intent);
            }
        });
    }

}
