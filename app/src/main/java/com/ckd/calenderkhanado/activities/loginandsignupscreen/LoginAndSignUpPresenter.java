package com.ckd.calenderkhanado.activities.loginandsignupscreen;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.ckd.calenderkhanado.base.BasePresenter;

/**
 * Created by acer on 4/21/2018.
 */

public class LoginAndSignUpPresenter extends BasePresenter<LoginAndSignUpContract.IMainView>
        implements LoginAndSignUpContract.MainPresenter {


    public LoginAndSignUpPresenter(Context context) {
        super(context);
    }

    @Override
    public void onSubmitButtonClicked() {

        mView.showMessage("kkkkkk");

    }

    @Override
    public void onRetriveButtonClicked() {

    }

    @Override
    public void getDataFromAPI() {

    }


    @Override
    public void gmailLogin() {

    }
}
