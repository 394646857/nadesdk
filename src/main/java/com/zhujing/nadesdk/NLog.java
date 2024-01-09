package com.zhujing.nadesdk;

import android.util.Log;

/**
 * 日志输出工具
 */
public class NLog {

    public static final String TAG = "nlog";
    private static int leavel = 7;
    public static void d(String s){
        if (leavel< 7){
            Log.d(TAG,s);
        }
    }
    public static void i(String i){
        if (leavel< 7){
            Log.i(TAG,i);
        }
    }
    public static void e(String e){
        if (leavel< 7){
            Log.e(TAG,e);
        }
    }


    public static void setSwitch(int mLeavel){
        leavel = mLeavel;
    }
}
