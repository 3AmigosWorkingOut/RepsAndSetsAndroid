package com.threeamigosworkingout.repsandsets.model;

import androidx.annotation.Nullable;

/**
 * Currently a singleton accessible anywhere in the app.
 * Is there a better way? TODO
 */
public class AppState {
    @Nullable
    private static AppState instance;

    public UserProfile userProfile = new UserProfile();

    public static AppState getAppState() {
        if (instance == null) {
            instance = new AppState();
        }
        return instance;
    }
}
