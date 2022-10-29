package com.Tables.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.ImageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);

        Thread timer = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent intent = new Intent(getApplicationContext(), HomeActivity2.class);
                    startActivity(intent);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        timer.start();

    }
}