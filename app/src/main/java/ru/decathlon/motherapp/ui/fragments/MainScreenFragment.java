package ru.decathlon.motherapp.ui.fragments;

import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import ru.decathlon.motherapp.R;

public class MainScreenFragment extends Fragment {

    private final static String TAG = MainScreenFragment.class.getSimpleName();

    @BindView(R.id.main_bottom_menu)
    BottomNavigationView bottomMenu;
}
