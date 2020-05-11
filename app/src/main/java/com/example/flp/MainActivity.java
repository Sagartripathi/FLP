package com.example.flp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.AdRequest;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd interstitialAd1, interstitialAd2, interstitialAd3, interstitialAd4, interstitialAd5, interstitialAd6;

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
        interstitialAd1 = new InterstitialAd(this);
        interstitialAd1.setAdUnitId(getString(R.string.interstical1));
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(MainActivity.this, history_flp.class);
                startActivity(intent);
                // Load the next interstitial.
                interstitialAd1.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId(getString(R.string.interstical2));
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(MainActivity.this, approval_flp.class);
                startActivity(intent);
                // Load the next interstitial.
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd3 = new InterstitialAd(this);
        interstitialAd3.setAdUnitId(getString(R.string.interstical3));
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(MainActivity.this, marketing_flp.class);
                startActivity(intent);
                // Load the next interstitial.
                interstitialAd3.loadAd(new AdRequest.Builder().build());
            }

        });

        interstitialAd4 = new InterstitialAd(this);
        interstitialAd4.setAdUnitId(getString(R.string.interstical4));
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(MainActivity.this, starting_flp.class);
                startActivity(intent);
                // Load the next interstitial.
                interstitialAd4.loadAd(new AdRequest.Builder().build());
            }

        });
        interstitialAd5 = new InterstitialAd(this);
        interstitialAd5.setAdUnitId(getString(R.string.interstical5));
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(MainActivity.this, rank_flp.class);
                startActivity(intent);
                // Load the next interstitial.
                interstitialAd5.loadAd(new AdRequest.Builder().build());
            }

        });
        interstitialAd6 = new InterstitialAd(this);
        interstitialAd6.setAdUnitId(getString(R.string.interstical6));
        interstitialAd6.loadAd(new AdRequest.Builder().build());
        interstitialAd6.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(MainActivity.this, benefit_flp.class);
                startActivity(intent);
                // Load the next interstitial.
                interstitialAd6.loadAd(new AdRequest.Builder().build());
            }
        });
    }

    public void history(View view) {
        if (interstitialAd1.isLoaded()) {
            interstitialAd1.show();
        } else {
            Intent intent = new Intent(this, history_flp.class);
            startActivity(intent);
        }
    }

    public void approvel(View view) {
        if (interstitialAd2.isLoaded()) {
            interstitialAd2.show();
        } else {
            Intent intent = new Intent(this, approval_flp.class);
            startActivity(intent);
        }

    }

    public void marketing(View view) {
        if (interstitialAd3.isLoaded()) {
            interstitialAd3.show();
        } else {
            Intent intent = new Intent(this, marketing_flp.class);
            startActivity(intent);
        }

    }

    public void start(View view) {
        if (interstitialAd4.isLoaded()) {
            interstitialAd4.show();
        } else {
            Intent intent = new Intent(this, starting_flp.class);
            startActivity(intent);
        }

    }

    public void ranking(View view) {
        if (interstitialAd5.isLoaded()) {
            interstitialAd5.show();
        } else {
            Intent intent = new Intent(this, rank_flp.class);
            startActivity(intent);
        }

    }

    public void benefit(View view) {
        if (interstitialAd6.isLoaded()) {
            interstitialAd6.show();
        } else {
            Intent intent = new Intent(this, benefit_flp.class);
            startActivity(intent);
        }
    }

}
