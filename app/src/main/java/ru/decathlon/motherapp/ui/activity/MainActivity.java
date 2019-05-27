package ru.decathlon.motherapp.ui.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import ru.decathlon.motherapp.R;
import ru.decathlon.motherapp.ui.activity.base.AppBaseActivity;

public class MainActivity extends AppBaseActivity implements HasSupportFragmentInjector{

    private static final String TAG = MainActivity.class.getSimpleName();


    @Inject
    DispatchingAndroidInjector<Fragment> androidInjector;

    Fragment navigationHostFragment;

    NavController mainNavigationController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationHostFragment = getSupportFragmentManager().findFragmentById(R.id.main_nav_host_fragment);
        mainNavigationController = Navigation.findNavController(this, R.id.main_nav_host_fragment);

    }

    public NavController getMainNavController() {
        return mainNavigationController;
    }






    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return androidInjector;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
