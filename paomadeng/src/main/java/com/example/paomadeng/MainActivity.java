package com.example.paomadeng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

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
        lists.add(new ADEnity("吃饭注意的事项:","细嚼慢咽","1111111111111"));
        lists.add(new ADEnity("京东最大的优势:","自营","222222222222"));
        lists.add(new ADEnity("你是谁？","我是电脑","333333333333"));
        lists.add(new ADEnity("他是谁？","他是手机","444444444444"));
        tv.setmTexts(lists);
        tv.setOnClickLitener(new TextViewAd.onClickLitener() {
            @Override
            public void onClick(String mUrl) {
                Toast.makeText(MainActivity.this,""+mUrl,Toast.LENGTH_SHORT).show();
            }
        });
        tv.setmDuration(1500);
        tv.setmInterval(500);
        tv.setFrontColor(R.color.colorAccent);
        tv.setFrontColor(R.color.colorPrimary);
    }
}
