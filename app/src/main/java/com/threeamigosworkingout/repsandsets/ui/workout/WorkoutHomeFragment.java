package com.threeamigosworkingout.repsandsets.ui.workout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.threeamigosworkingout.repsandsets.R;
import com.threeamigosworkingout.repsandsets.ui.base.RepsAndSetsBaseFragment;

public class WorkoutHomeFragment extends RepsAndSetsBaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.workout_home_fragment, container, false);
        return view;
    }
}
