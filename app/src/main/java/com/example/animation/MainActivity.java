package com.example.animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_animation;
    Animation clockwiseAnimation, fadeAnimation, blinkAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_animation = findViewById(R.id.tv_animation);
        clockwiseAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        fadeAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        blinkAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.clockWise:
                tv_animation.startAnimation(clockwiseAnimation);
                break;
            case R.id.fade:
                tv_animation.startAnimation(fadeAnimation);
                break;
            case R.id.blink:
                tv_animation.startAnimation(blinkAnimation);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}