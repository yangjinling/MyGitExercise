package com.example.paomadeng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.paomadeng.view.TextViewAd;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextViewAd tv;
    private List<ADEnity>lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextViewAd) findViewById(R.id.tv));
        lists=new ArrayList<ADEnity>();
        lists.add(new ADEnity("1:","1",""));
        lists.add(new ADEnity("2:","2",""));
        lists.add(new ADEnity("3:","3",""));
        lists.add(new ADEnity("4:","4",""));
        tv.setmTexts(lists);
    }
}
