package com.example.baidupushexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushManager.startWork(getApplicationContext(), PushConstants.LOGIN_TYPE_API_KEY,"D6YyrYqHfb3rw34ei3Gt0oGY");
    }
}
