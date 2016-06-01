package com.example.animationacitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SecondActivity extends AppCompatActivity {

    private ExecutorService mExecutorService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiti);
        mExecutorService = Executors.newSingleThreadExecutor();
        mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
            }
        });
    }
}
