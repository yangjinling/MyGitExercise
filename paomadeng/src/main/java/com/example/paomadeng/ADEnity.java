package com.example.paomadeng;

/**
 * 作者：杨金玲 on 2016/5/31 11:36
 * 邮箱：18363820101@163.com
 */

public class ADEnity {
    private String mFront ; //前面的文字
    private String mBack ; //后面的文字
    private String mUrl ;//包含的链接

    public ADEnity(String mFront, String mBack,String mUrl) {
        this.mFront = mFront;
        this.mBack = mBack;
        this.mUrl = mUrl;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmFront() {
        return mFront;
    }

    public void setmFront(String mFront) {
        this.mFront = mFront;
    }

    public String getmBack() {
        return mBack;
    }

    public void setmBack(String mBack) {
        this.mBack = mBack;
    }
}

