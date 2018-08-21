package clem.app.dagger2_android.di;

import clem.app.dagger2_android.di.module.MainActivityModule;
import clem.app.dagger2_android.di.module.SecondActivityModule;
import clem.app.dagger2_android.di.scope.ActivityScope;
import clem.app.dagger2_android.mvp.activity.MainActivity;
import clem.app.dagger2_android.mvp.activity.SecondActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AllActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();
}
