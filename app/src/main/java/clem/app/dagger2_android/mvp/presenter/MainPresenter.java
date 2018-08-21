package clem.app.dagger2_android.mvp.presenter;

import javax.inject.Inject;

import clem.app.dagger2_android.mvp.activity.MainActivity;
import clem.app.dagger2_android.mvp.contract.MainContract;
import clem.app.dagger2_android.mvp.model.MainModel;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */

public class MainPresenter implements MainContract.Presenter {

    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    public void requestHttp() {
        view.onGetMessage(model.returnMessage());
    }
}
