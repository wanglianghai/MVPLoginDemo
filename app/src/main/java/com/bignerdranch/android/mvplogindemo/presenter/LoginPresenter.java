package com.bignerdranch.android.mvplogindemo.presenter;

import com.bignerdranch.android.mvplogindemo.model.entities.User;

/**
 * Created by Administrator on 2017/8/4/004.
 */

public interface LoginPresenter {
    void validateCredential(User user);
}
