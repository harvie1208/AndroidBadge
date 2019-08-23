package com.harvie1208.badgedemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.harvie1208.badgelib.BadgeHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BadgeHelper.setNotification(R.mipmap.ic_launcher,"badge","badge","消息通知",MainActivity.class);
        findViewById(R.id.tv_1).setOnClickListener(v-> {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    BadgeHelper.setCount(55,MainActivity.this);
                }
            },3000);
        });
    }
}
