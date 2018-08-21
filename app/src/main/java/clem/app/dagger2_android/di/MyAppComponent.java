package clem.app.dagger2_android.di;


import clem.app.dagger2_android.base.MyApplication;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitiesModule.class
})
public interface MyAppComponent {

    void inject(MyApplication application);
}
