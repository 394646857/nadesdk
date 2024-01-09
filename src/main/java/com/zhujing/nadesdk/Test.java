package com.zhujing.nadesdk;

import android.content.Context;

public class Test {

    private NShareSpUtil spUtil;

    public void test(Context context){
        spUtil = new NShareSpUtil().getInstance(context);
        spUtil.saveString("name","11");
        String name = spUtil.getString("name");
        NLog.d(name);
    }
}
