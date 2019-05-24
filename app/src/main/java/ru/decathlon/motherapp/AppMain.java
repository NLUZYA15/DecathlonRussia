package ru.decathlon.motherapp;

import android.app.Activity;
import android.app.Application;
import android.app.Service;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasServiceInjector;
import io.realm.Realm;
import ru.decathlon.motherapp.di.AppMainInjector;

public class AppMain extends Application implements HasActivityInjector, HasServiceInjector {


    @Inject
    DispatchingAndroidInjector<Activity> activityAndroidInjector;

    @Inject
    DispatchingAndroidInjector<Service> serviceAndroidInjector;

    private static AppMain instance;

    public static synchronized AppMain getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        AppMainInjector.init(this);

        Realm.init(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityAndroidInjector;
    }

    @Override
    public AndroidInjector<Service> serviceInjector() {
        return serviceAndroidInjector;
    }
}
