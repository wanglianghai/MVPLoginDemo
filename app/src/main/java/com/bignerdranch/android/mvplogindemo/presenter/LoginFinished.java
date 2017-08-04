package com.bignerdranch.android.mvplogindemo.presenter;

/**
 * Created by Administrator on 2017/8/4/004.
 */

//on...
public interface LoginFinished {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
