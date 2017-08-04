package com.bignerdranch.android.mvplogindemo.model;

import com.bignerdranch.android.mvplogindemo.model.entities.User;
import com.bignerdranch.android.mvplogindemo.presenter.LoginFinished;

/**
 * Created by Administrator on 2017/8/4/004.
 */

public interface LoginModel {
    void login(User user, LoginFinished loginFinished);
}
