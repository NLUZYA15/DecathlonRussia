package ru.decathlon.motherapp.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.decathlon.motherapp.R;
import ru.decathlon.motherapp.di.Injectable;

public class MainScreenFragment extends Fragment implements Injectable {

    private final static String TAG = MainScreenFragment.class.getSimpleName();

    @BindView(R.id.main_bottom_menu)
    BottomNavigationView bottomMenu;

    @BindView(R.id.sub_main_nav_host_fragment)
    View subMainNavHostFragment;


    private NavController subMainNavController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView()");

        assert getActivity() != null;

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        return view;
    }



}
