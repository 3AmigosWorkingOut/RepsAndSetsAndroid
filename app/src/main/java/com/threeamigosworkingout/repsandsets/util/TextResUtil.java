package com.threeamigosworkingout.repsandsets.util;

import com.threeamigosworkingout.repsandsets.RepsAndSetsApplication;

import timber.log.Timber;

public class TextResUtil {

    /**
     * Retrieves a string from resources.
     * @param resId - the resource id for the string
     * @return - the string or empty string if not found
     */
    public static String getStringFromResSafely(int resId) {
        String resString = "";
        try {
            resString = RepsAndSetsApplication.getAppContext().getString(resId);
        } catch (Exception e) {
            Timber.e(e);
        }
        return resString;
    }
}
