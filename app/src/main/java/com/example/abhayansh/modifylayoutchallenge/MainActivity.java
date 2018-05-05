package com.example.abhayansh.modifylayoutchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.profile_button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this, Profile.class);
                startActivity(myIntent);
            }
        });
    }
}
