package com.bignerdranch.android.mvplogindemo.view;

/**
 * Created by Administrator on 2017/8/4/004.
 */

//set...
public interface LoginView {
    void setUsernameError();

    void setPasswordError();

    void loginSuccess();

    void showProgressBar();

    void hideProgressBar();
}
