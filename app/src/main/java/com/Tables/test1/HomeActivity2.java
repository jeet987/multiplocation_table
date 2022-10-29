package com.Tables.test1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;


public class HomeActivity2 extends AppCompatActivity {

    private Button ShareButton;

    private Button OneToTenbtn;
    private Button ElevenToTwentybtn;
    private Button TwentyoneToThirtybtn;
    private Button ThirtyoneTofourtybtn;
    private Button FourtyoneToFiftybtn;
    private Button FiftyoneToSixtyybtn;
    private Button SixtyOneToSeventybtn;
    private Button SeventyOneToEightybtn;
    private Button EightyOneToNintybtn;
    private Button NintyOneToHundredbtn;

    private AdView mAdView;

    private RewardedAd mRewardedAd = null;
    private final String TAG ="--->AdMob";

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do You Want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        HomeActivity2.super.onBackPressed();


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.cancel();

                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);



       AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3650990573229785/3277518075");




        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                loadRewardedAd();
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ShareButton = (Button) findViewById(R.id.ShareButton);
        ShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=com.Table.test1";//
                String shareSub = "test1 Tables";

                shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);

                startActivity(Intent.createChooser(shareIntent, "Share Using"));

            }
        });


        OneToTenbtn = findViewById(R.id.OneToTenbtn);

        OneToTenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, OneToTen.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();
            }
        });

        ElevenToTwentybtn = findViewById(R.id.ElevenToTwentybtn);

        ElevenToTwentybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, Eleven11.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        TwentyoneToThirtybtn = findViewById(R.id.TwentyoneToThirtybtn);

        TwentyoneToThirtybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, TwentyOne21.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        ThirtyoneTofourtybtn = findViewById(R.id.ThirtyoneTofourtybtn);

        ThirtyoneTofourtybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, ThirtyOne31.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });
        FourtyoneToFiftybtn = findViewById(R.id.FourtyoneToFiftybtn);

        FourtyoneToFiftybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, FortyOne41.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });


        FiftyoneToSixtyybtn = findViewById(R.id.FiftyoneToSixtyybtn);

        FiftyoneToSixtyybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, FiftyOne51.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        SixtyOneToSeventybtn = findViewById(R.id.SixtyOneToSeventybtn);

        SixtyOneToSeventybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, SixtyOne61.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        SeventyOneToEightybtn = findViewById(R.id.SeventyOneToEightybtn);

        SeventyOneToEightybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, SeventyOne71.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        EightyOneToNintybtn = findViewById(R.id.EightyOneToNintybtn);

        EightyOneToNintybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, EightyOne81.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        NintyOneToHundredbtn = findViewById(R.id.NintyOneToHundredbtn);

        NintyOneToHundredbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity2.this, NintyOne91.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });
    }


    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-3650990573229785/1979458551",
                adRequest, new RewardedAdLoadCallback(){
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d(TAG, loadAdError.getMessage());
                        mRewardedAd = null;
                        Log.d(TAG, "onAdFailedToLoad");
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d(TAG, "Ad is Lodaded");

                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(TAG, "Ad was shown.");
                                mRewardedAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.d(TAG, "Ad failed to show.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Don't forget to set the ad reference to null so you
                                // don't show the ad a second time.
                                Log.d(TAG, "Ad was dismissed.");
                                loadRewardedAd();
                            }
                        });
                    }
                });
    }
    private void showRewardedAd(){
        if (mRewardedAd != null) {

            mRewardedAd.show(this, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    Log.d(TAG, "The user earned the reward.");
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();


                }
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
        }
    }
}

