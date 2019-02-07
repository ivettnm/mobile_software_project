package com.example.asus.myfisrtapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect button object xml layout with java (functionality)
        Button btnNewAct = (Button) findViewById(R.id.button);

        //Event listener
        btnNewAct.setOnClickListener(
                new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Intent myintent;
                         myintent = new Intent(MainActivity.this, TargetActivity.class);
                         startActivity(myintent);
                     }
                 }
        );

    }
}
