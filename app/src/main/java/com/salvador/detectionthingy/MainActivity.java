package com.salvador.detectionthingy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        h = new Handler(this.getMainLooper());

        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent().setClass(getApplicationContext(),MonitoringData.class));
                finish();
            }
        }, 2000);
    }
}