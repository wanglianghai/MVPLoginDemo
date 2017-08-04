package com.bignerdranch.android.mvplogindemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bignerdranch.android.mvplogindemo.R;
import com.bignerdranch.android.mvplogindemo.model.entities.User;
import com.bignerdranch.android.mvplogindemo.presenter.impl.LoginPresenterImpl;
import com.bignerdranch.android.mvplogindemo.view.LoginView;
//创建model的entities（user），创建presenter的impl(LoginPresenterImpl)处理user
//视图的显示
public class LoginActivity extends AppCompatActivity implements LoginView {
    private EditText mEditTextUser;
    private EditText mEditTextPassword;
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEditTextUser = (EditText) findViewById(R.id.user);
        mEditTextPassword = (EditText) findViewById(R.id.key);
        mProgress = (ProgressBar) findViewById(R.id.progress);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setUsername(mEditTextUser.getText().toString());
                user.setPassword(mEditTextPassword.getText().toString());
                new LoginPresenterImpl(LoginActivity.this).validateCredential(user);
            }
        });
    }

    @Override
    public void setUsernameError() {
        mEditTextUser.setError("username empty");
    }

    @Override
    public void setPasswordError() {
        mEditTextPassword.setError("password empty");
    }

    @Override
    public void loginSuccess() {
        mProgress.setVisibility(View.GONE);
        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressBar() {
        mProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        mProgress.setVisibility(View.GONE);
    }
}
