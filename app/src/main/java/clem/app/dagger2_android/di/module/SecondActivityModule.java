package clem.app.dagger2_android.di.module;


import clem.app.dagger2_android.mvp.activity.SecondActivity;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SecondActivityModule {

    @Provides
    static String provideName() {
        return SecondActivity.class.getName();
    }

}
