package com.bignerdranch.android.mvplogindemo.presenter.impl;

import com.bignerdranch.android.mvplogindemo.model.LoginModel;
import com.bignerdranch.android.mvplogindemo.model.entities.User;
import com.bignerdranch.android.mvplogindemo.model.impl.LoginModelImp;
import com.bignerdranch.android.mvplogindemo.presenter.LoginFinished;
import com.bignerdranch.android.mvplogindemo.presenter.LoginPresenter;
import com.bignerdranch.android.mvplogindemo.view.LoginView;

/**
 * Created by Administrator on 2017/8/4/004.
 */
//传user给LoginModelImpl和user视图控制
public class LoginPresenterImpl implements LoginFinished, LoginPresenter {
    LoginView mView;
    //控制login view的视图
    public LoginPresenterImpl(LoginView view) {
        mView = view;
    }
    @Override
    public void onUsernameError() {
        mView.setUsernameError();
        mView.hideProgressBar();
    }

    @Override
    public void onPasswordError() {
        mView.setPasswordError();
        mView.hideProgressBar();
    }

    @Override
    public void onSuccess() {
        mView.loginSuccess();
        mView.hideProgressBar();
    }

    @Override
    public void validateCredential(User user) {
        mView.showProgressBar();
        new LoginModelImp().login(user, this);
    }
}
