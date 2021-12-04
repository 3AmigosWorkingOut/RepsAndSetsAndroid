package com.threeamigosworkingout.repsandsets.ui.splash;

import static com.threeamigosworkingout.repsandsets.R.layout.activity_splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

import com.threeamigosworkingout.repsandsets.R;
import com.threeamigosworkingout.repsandsets.ui.authentication.AuthActivity;
import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseActivity;
import com.threeamigosworkingout.repsandsets.ui.workout.WorkoutMainActivity;

/**
 * The entry to the application. Has a specifically set splash theme.
 * Determines if the user is found and directs to main/auth accordingly.
 *
 * TODO: Make the splash view pretty
 */
public class SplashActivity extends RepsAndSetsBaseActivity {
    // View elements
    @Nullable
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_splash);

        this.progressBar = findViewById(R.id.splash_loading);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (progressBar != null)
            progressBar.setVisibility(View.VISIBLE);

        if (hasSavedUser()) {
            navigateToMain();
        } else {
            navigateToAuth();
        }
    }

    private void navigateToAuth() {
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
        finish(); // closes the activity and clears it from the backstack so you can not hit back to it
    }

    private void navigateToMain() {
        // TODO start the main activity
        Intent intent = new Intent(this, WorkoutMainActivity.class);
        startActivity(intent);
        finish();
    }

    private boolean hasSavedUser() {
        // TODO determine if user has logged in
        return false;
    }
}
