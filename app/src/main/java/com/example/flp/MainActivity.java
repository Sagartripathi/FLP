package com.example.flp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.AdRequest;



public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
        Intent intent = new Intent(this, rank_flp.class);
        startActivity(intent);

    }

    public void benefit(View view) {
        Intent intent = new Intent(this, benefit_flp.class);
        startActivity(intent);

    }


    public void approvel(View view) {
        Intent intent = new Intent(this, approval_flp.class);
        startActivity(intent);
    }

    public void history(View view) {
        Intent intent = new Intent(this, history_flp.class);
        startActivity(intent);
    }
}
