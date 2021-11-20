package com.threeamigosworkingout.repsandsets.ui.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.threeamigosworkingout.repsandsets.R;
import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseFragment;

/**
 * Login the user
 * TODO - integrate firebase auth
 */
public class LoginFragment extends RepsAndSetsBaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_auth_login, container, false);
        return view;
    }

    // TODO move logic to view model
    private void loginUser(String password) { // TODO what params are needed?

    }

    private void onUserLoggedInSuccess() {
        // TODO save user profile to app state?
        // TODO navigate to main
    }
}
