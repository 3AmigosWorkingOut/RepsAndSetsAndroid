package com.threeamigosworkingout.repsandsets.ui.authentication;

import static com.threeamigosworkingout.repsandsets.R.layout.activity_auth;

import android.os.Bundle;

import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseActivity;

public class AuthActivity extends RepsAndSetsBaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_auth);
    }
}
