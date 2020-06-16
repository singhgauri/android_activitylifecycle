package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("oncreate","OnCreate method called......");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onstart","OnStart method called......");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onpause","OnPause method called......");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onresume","OnResume method called......");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onstop","OnStop method called......");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ondestroy","OnDestroy method called......");
    }

}
