package com.example.abhayansh.modifylayoutchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        button = (Button) findViewById(R.id.back);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
               finish();
            }
        });
    }
}
