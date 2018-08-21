package clem.app.dagger2_android.mvp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import clem.app.dagger2_android.R;
import clem.app.dagger2_android.base.BaseActivity;
import clem.app.dagger2_android.bean.Student;
import clem.app.dagger2_android.bean.Teacher;
import clem.app.dagger2_android.mvp.contract.MainContract;
import clem.app.dagger2_android.mvp.presenter.MainPresenter;


/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    String className;
    @Inject
    SharedPreferences sp;
    @Inject
    MainPresenter presenter;
    @Inject
    Student s1;
    @Inject
    Student s2;
    @Inject
    Teacher t1;

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvContent.setText(className + "\n" +
                s2.toString() + "\n" +
                s1.toString() + "\n" +
                t1.toString() + " " + t1.getName());

    }

    public void gotoSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void requestHttp(View view) {
        presenter.requestHttp();
    }

    public void onGetMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
