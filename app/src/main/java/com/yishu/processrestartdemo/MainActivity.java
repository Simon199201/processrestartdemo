package com.yishu.processrestartdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yishu.processrestartdemo.service.LocalService;
import com.yishu.processrestartdemo.service.RomoteService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, LocalService.class));
        startService(new Intent(this, RomoteService.class));
//        startService(new Intent(this, LocalService.class));
    }
}
