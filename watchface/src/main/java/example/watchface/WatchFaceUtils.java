package example.watchface;


import android.content.res.Resources;

import java.util.Calendar;

public class WatchFaceUtils {
    public static int getIconResourceForWeatherCondition(int weatherId) {
        if (weatherId >= 180 && weatherId <= 200) {
            return R.drawable.ic_storm;
        } else if (weatherId >= 270 && weatherId <= 300) {
            return R.drawable.ic_light_rain;
        } else if (weatherId >= 490 && weatherId <= 510) {
            return R.drawable.ic_rain;
        } else if (weatherId == 511) {
            return R.drawable.ic_snow;
        } else if (weatherId >= 520 && weatherId <= 530) {
            return R.drawable.ic_rain;
        } else if (weatherId >= 600 && weatherId <= 610) {
            return R.drawable.ic_snow;
        } else if (weatherId >= 700 && weatherId <= 750) {
            return R.drawable.ic_fog;
        } else if (weatherId == 760 || weatherId == 780) {
            return R.drawable.ic_storm;
        } else if (weatherId == 800) {
            return R.drawable.ic_clear;
        } else if (weatherId == 810) {
            return R.drawable.ic_light_clouds;
        } else if (weatherId >= 800 && weatherId <= 805) {
            return R.drawable.ic_cloudy;
        }
        return -1;
    }

    public static String getAmPmString(Resources resources, int am_pm) {
        return am_pm == Calendar.AM ? resources.getString(R.string.am) : resources.getString(R.string.pm);
    }
}
