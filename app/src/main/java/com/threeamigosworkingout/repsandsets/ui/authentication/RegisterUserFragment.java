package com.threeamigosworkingout.repsandsets.ui.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;

import com.threeamigosworkingout.repsandsets.R;
import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseFragment;

import timber.log.Timber;

public class RegisterUserFragment extends RepsAndSetsBaseFragment {
    @Nullable
    private TextView goToLoginText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_auth_register_user, container, false);

        goToLoginText = view.findViewById(R.id.go_to_login_text);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (goToLoginText != null) {
            goToLoginText.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Timber.d("Go to login from register");
                    navigateToLogin();
                }
            });
        }
    }

    private void navigateToLogin() {
        try {
            Navigation.findNavController(requireView()).navigate(R.id.action_registerUserFragment_to_loginFragment);
        } catch (IllegalStateException e) {
            Timber.e( e,"Could not nav to login");
        }
    }
}
