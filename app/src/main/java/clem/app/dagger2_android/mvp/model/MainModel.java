package clem.app.dagger2_android.mvp.model;

import javax.inject.Inject;

import clem.app.dagger2_android.mvp.contract.MainContract;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */

public class MainModel implements MainContract.Model {

    @Inject
    public MainModel() {
    }

    public String returnMessage() {
        return "qingmei2";
    }
}
