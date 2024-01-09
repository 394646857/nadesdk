package com.zhujing.nadesdk;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * sp管理工具，sp作为轻量级数据库使用，只保存基本数据类型。推荐使用数据库保存。
 */
public class NShareSpUtil {
    public static final String NSP_NAME = "nspName";
    private static SharedPreferences nSpInstance;

    public NShareSpUtil spUtil;


    public NShareSpUtil getInstance(Context context){
        if (spUtil == null) {
            synchronized (NShareSpUtil.this){
                if (spUtil == null) {
                    spUtil = new NShareSpUtil();
                    createSpInstance(context);
                }
            }
        }
        return spUtil;
    }

    public SharedPreferences createSpInstance(Context context){
        if (null == nSpInstance) {
            synchronized (NShareSpUtil.this){
                if (null == nSpInstance) {
                    nSpInstance = context.getSharedPreferences(NSP_NAME, Context.MODE_PRIVATE);
                }
            }
        }
        return nSpInstance;
    }

    public static void saveString(String key,String value){
        if (nSpInstance != null) {
            nSpInstance.edit().putString(key, value).commit();
        }
    }

    public static String getString(String key){
        if (nSpInstance != null) {
            return nSpInstance.getString(key, "");
        }
        return "";
    }

    public static void saveBool(String key,boolean value){
        if (nSpInstance != null) {
            nSpInstance.edit().putBoolean(key, value).commit();
        }
    }
    public static boolean getBool(String key){
        if (nSpInstance != null) {
            return nSpInstance.getBoolean(key, false);
        }
        return false;
    }

    public static void saveInt(String key,int value){
        if (nSpInstance != null) {
            nSpInstance.edit().putInt(key, value).commit();
        }
    }
    public static Integer getInt(String key){
        if (nSpInstance != null) {
            return nSpInstance.getInt(key, 0);
        }
        return 0;
    }

    public static void saveLong(String key,int value){
        if (nSpInstance != null) {
            nSpInstance.edit().putLong(key, value).commit();
        }
    }
    public static Long getLong(String key){
        if (nSpInstance != null) {
            return nSpInstance.getLong(key, 0);
        }
        return 0L;
    }

    public static void saveFloat(String key,int value){
        if (nSpInstance != null) {
            nSpInstance.edit().putFloat(key, value).commit();
        }
    }
    public static Float getFloat(String key){
        if (nSpInstance != null) {
            return nSpInstance.getFloat(key, 0f);
        }
        return 0f;
    }
}
