package com.ckd.calenderkhanado.activities.mainscreen;


import com.ckd.calenderkhanado.base.IBasePresenter;
import com.ckd.calenderkhanado.base.IBaseView;

/**
 * Created by Niel on 18/07/17.
 */

public class MainActivityContract {

  public interface IMainView extends IBaseView {
    void setUserName(String mUserName);
  }


  public interface MainPresenter extends IBasePresenter {

    void onSubmitButtonClicked();

    void onRetriveButtonClicked();

    void getDataFromAPI();

  }
}
