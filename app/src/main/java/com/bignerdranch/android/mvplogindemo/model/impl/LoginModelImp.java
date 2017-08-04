package com.bignerdranch.android.mvplogindemo.model.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.bignerdranch.android.mvplogindemo.model.LoginModel;
import com.bignerdranch.android.mvplogindemo.model.entities.User;
import com.bignerdranch.android.mvplogindemo.presenter.LoginFinished;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/8/4/004.
 */

public class LoginModelImp implements LoginModel {
    @Override
    public void login(User user, final LoginFinished loginFinished) {
        final String username = user.getUsername();
        final String password = user.getPassword();
        Observable.create(new ObservableOnSubscribe<User>() {
            @Override
            public void subscribe(ObservableEmitter<User> e) throws Exception {
                Thread.sleep(2000);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<User>() {
                    @Override
                    public void accept(User user) throws Exception {

                    }
                });

    }
}
