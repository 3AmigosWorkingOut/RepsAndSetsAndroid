package com.threeamigosworkingout.repsandsets.ui.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;

import com.threeamigosworkingout.repsandsets.R;
import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseFragment;

import timber.log.Timber;

public class AuthenticationMainFragment extends RepsAndSetsBaseFragment {

    // View components
    @Nullable private Button loginButton;
    @Nullable private Button registerButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_auth_main, container, false);

        loginButton = view.findViewById(R.id.button_login);
        registerButton = view.findViewById(R.id.button_registerUser);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (loginButton != null) {
            loginButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Timber.d("Login clicked");
                    navigateToLogin();
                }
            });
        }

        if (registerButton != null) {
            registerButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Timber.d("Register clicked");
                    navigateToRegisterUser();
                }
            });
        }
    }

    private void navigateToLogin() {
        try {
            Navigation.findNavController(requireView()).navigate(R.id.action_authenticationFragment_to_loginFragment);
        } catch (IllegalStateException e) {
            Timber.e(e);
        }
    }

    private void navigateToRegisterUser() {
        try {
            Navigation.findNavController(requireView()).navigate(R.id.action_authenticationFragment_to_registerUserFragment);
        } catch (IllegalStateException e) {
            Timber.e(e);
        }
    }
}
