package com.example.baidupushexercise;

import android.content.Context;
import android.util.Log;

import com.baidu.android.pushservice.PushMessageReceiver;

import java.util.List;

/**
 * 作者：杨金玲 on 2016/6/6 10:11
 * 邮箱：18363820101@163.com
 */

public class MyReciever extends PushMessageReceiver {
    @Override
    public void onBind(Context context, int i, String s, String s1, String s2, String s3) {

    }

    @Override
    public void onUnbind(Context context, int i, String s) {

    }

    @Override
    public void onSetTags(Context context, int i, List<String> list, List<String> list1, String s) {

    }

    @Override
    public void onDelTags(Context context, int i, List<String> list, List<String> list1, String s) {

    }

    @Override
    public void onListTags(Context context, int i, List<String> list, String s) {

    }

    @Override
    public void onMessage(Context context, String s, String s1) {

    }

    @Override
    public void onNotificationClicked(Context context, String s, String s1, String s2) {
        //s标题   s1内容
        Log.e("YJL","s="+s+"s1="+s1+"s2="+s2);
    }

    @Override
    public void onNotificationArrived(Context context, String s, String s1, String s2) {

    }
}
