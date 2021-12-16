package com.nareshgediya.kemchho.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.nareshgediya.kemchho.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        LottieAnimationView loading = findViewById(R.id.lottieLoading);
        loading.setAlpha(0f);

        ImageView imageView = findViewById(R.id.kem);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
     imageView.setAnimation(animation);


        loading.animate().alpha(1f).setDuration(1200).setStartDelay(500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, PhoneNumberActivity.class));
                finish();
            }
        },3500);
    }
}