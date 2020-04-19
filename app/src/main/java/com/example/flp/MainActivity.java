package com.example.flp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void history(View view) {

        Intent intent = new Intent(this, history_flp.class);
        startActivity(intent);

    }


    public void approvel(View view) {
        Intent intent = new Intent(this, approval_flp.class);
        startActivity(intent);


    }

    public void marketing(View view) {
        Intent intent = new Intent(this, marketing_flp.class);
        startActivity(intent);

    }
    public void start(View view) {
        Intent intent = new Intent(this, starting_flp.class);
        startActivity(intent);

    }

    public void ranking(View view) {
        Intent intent = new Intent(this, benefit_flp.class);
        startActivity(intent);

    }

    public void benefit(View view) {
        Intent intent = new Intent(this, rank_flp.class);
        startActivity(intent);

    }


}
