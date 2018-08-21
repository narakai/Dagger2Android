package clem.app.dagger2_android.mvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import javax.inject.Inject;

import clem.app.dagger2_android.R;
import clem.app.dagger2_android.base.BaseActivity;

/**
 * Created by QingMei on 2017/7/31.
 * desc:
 */

public class SecondActivity extends BaseActivity {

    @Inject
    String className;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView) findViewById(R.id.tv_content);
        tv.setText(className);
    }
}
