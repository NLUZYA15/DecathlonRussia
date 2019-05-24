package ru.decathlon.motherapp.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import ru.decathlon.motherapp.AppMain;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,

})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
    void inject(AppMain app);
}