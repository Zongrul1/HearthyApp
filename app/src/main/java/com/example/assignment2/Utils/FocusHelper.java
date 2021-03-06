package com.example.assignment2.Utils;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class FocusHelper {
    public final static int DAILY_STATS = 0;
    public final static int YESTERDAY_STATS = 1;
    public final static int WEEKLY_STATS = 2;
    public final static int MONTHLY_STATS = 3;
    public final static int NETWORK_MODE = 1;

    private static UsageStatsManager mUsageStatsManager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void initAppHelper(Context context) {
        if (mUsageStatsManager == null) {
            mUsageStatsManager = (UsageStatsManager) context.getSystemService(Context.USAGE_STATS_SERVICE);
        }
    }

    public static UsageStatsManager getUsageStatsManager() {
        return mUsageStatsManager;
    }

    public static String getTime(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        String time = hours % 24 + ":" + minutes % 60 + ":" + seconds % 60;
        return time;
    }

    public static float getHours(long millis) {
        float seconds = millis / 1000;
        float minutes = seconds / 60;
        float hours = (minutes/60);
        return hours;
    }

    public static float getMinutes(long millis) {
        float seconds = millis / 1000;
        float minutes = seconds / 60;
        return minutes;
    }
}