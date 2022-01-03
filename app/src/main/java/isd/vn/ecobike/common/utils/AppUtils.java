package isd.vn.ecobike.common.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Color;

import androidx.annotation.ArrayRes;
import androidx.annotation.StringRes;

public class AppUtils {

    private static Context mContext;


    public static void init(Context context) {
        mContext = context;
    }


    public static Context getAppContext() {
        return mContext;
    }

    public static AssetManager getAssets() {
        return mContext.getAssets();
    }

    public static float getDimension(int id) {
        return getResource().getDimension(id);
    }

    public static Resources getResource() {
        return mContext.getResources();
    }


    @SuppressWarnings("deprecation")
    public static int getColor(int resId) {
        return mContext.getResources().getColor(resId);
    }

    public static int getColor(String color) {
        return Color.parseColor(color);
    }

    public static String getString(@StringRes int resId) {
        return mContext.getResources().getString(resId);
    }

    public static String[] getStringArray(@ArrayRes int resId) {
        return mContext.getResources().getStringArray(resId);
    }


}
