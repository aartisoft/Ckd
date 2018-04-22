package com.ckd.calenderkhanado.activities.loginandsignupscreen;

import com.ckd.calenderkhanado.base.IBasePresenter;
import com.ckd.calenderkhanado.base.IBaseView;

/**
 * Created by acer on 4/21/2018.
 */

public class LoginAndSignUpContract {


    public interface IMainView extends IBaseView {
     //   void (String mUserName);
    }


    public interface MainPresenter extends IBasePresenter {
        public void gmailLogin();

    }
}
