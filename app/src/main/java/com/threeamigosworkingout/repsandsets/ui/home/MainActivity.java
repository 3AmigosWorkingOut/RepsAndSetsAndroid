package com.threeamigosworkingout.repsandsets.ui.home;

import static com.threeamigosworkingout.repsandsets.R.layout.activity_main;

import android.os.Bundle;

import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseActivity;

public class MainActivity extends RepsAndSetsBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }
}