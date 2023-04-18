package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {

    private static int timer = 4000;
    ImageView imageView1;
    TextView textView1,textView2;
    Animation upper_animation,bottom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);

        imageView1 = findViewById(R.id.goa_police_logo);
        textView1 = findViewById(R.id.goa_police_text);
        textView2 = findViewById(R.id.ebeat_text);

        upper_animation = AnimationUtils.loadAnimation(this,R.anim.upper_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView1.setAnimation(upper_animation);
        textView1.setAnimation(bottom_animation);
        textView2.setAnimation(bottom_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_screen.this,login.class);
                startActivity(intent);
                finish();
            }
        },timer);
    }
}