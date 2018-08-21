package clem.app.dagger2_android.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import clem.app.dagger2_android.bean.Student;
import clem.app.dagger2_android.bean.Teacher;
import clem.app.dagger2_android.di.scope.ActivityScope;
import clem.app.dagger2_android.mvp.activity.MainActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    static String provideName() {
        return MainActivity.class.getName();
    }

    @Provides
    static Teacher provideTeacher() {
        return new Teacher();
    }

    @Provides
    static SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    @ActivityScope
    static Student provideStudent() {
        return new Student();
    }
}
