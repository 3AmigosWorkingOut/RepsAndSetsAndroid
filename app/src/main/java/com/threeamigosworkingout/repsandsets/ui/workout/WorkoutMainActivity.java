package com.threeamigosworkingout.repsandsets.ui.workout;

import static com.threeamigosworkingout.repsandsets.R.layout.activity_workout_main;

import android.os.Bundle;

import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseActivity;

public class WorkoutMainActivity extends RepsAndSetsBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_workout_main);
    }
}