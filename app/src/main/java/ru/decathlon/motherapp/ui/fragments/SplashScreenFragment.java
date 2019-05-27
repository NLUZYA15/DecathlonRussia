package ru.decathlon.motherapp.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.decathlon.motherapp.R;
import ru.decathlon.motherapp.di.Injectable;
import ru.decathlon.motherapp.ui.activity.MainActivity;


public class SplashScreenFragment extends Fragment implements Injectable {

    private static final String TAG = SplashScreenFragment.class.getSimpleName();

    @BindView(R.id.splash)
    FrameLayout mainContainer;

    @BindView(R.id.loader_background)
    FrameLayout loaderBackground;

    private NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView()");

        View view = inflater.inflate(R.layout.fragment_splash, container, false);
        ButterKnife.bind(this, view);

        assert getActivity() != null;
        navController = ((MainActivity) getActivity()).getMainNavController();

        return view;
    }


}
