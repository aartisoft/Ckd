package com.ckd.calenderkhanado.activities.loginandsignupscreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.ckd.calenderkhanado.R;
import com.ckd.calenderkhanado.activities.mainscreen.MainActivityContract;
import com.ckd.calenderkhanado.activities.mainscreen.MainActivityPresenter;
import com.ckd.calenderkhanado.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginAndSignupActivity extends BaseActivity<LoginAndSignUpPresenter> implements LoginAndSignUpContract.IMainView {

    @BindView(R.id.submitButton)
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mPresenter = new LoginAndSignUpPresenter(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_signup);
        ButterKnife.bind(this);
        mPresenter.onSubmitButtonClicked();
    }

    @OnClick(R.id.submitButton)
    public void cliekd(){
      //
        // mPresenter.onSubmitButtonClicked();
    }

    @Override
    public void showMessage(String message) {
        super.showMessage(message);
    }
}
