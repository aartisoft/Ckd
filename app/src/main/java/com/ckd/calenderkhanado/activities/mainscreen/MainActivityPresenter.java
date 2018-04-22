package com.ckd.calenderkhanado.activities.mainscreen;

import android.content.Context;

import com.ckd.calenderkhanado.base.BasePresenter;
import com.ckd.calenderkhanado.data.network.RemoteCallback;
import com.ckd.calenderkhanado.data.network.RetroClient;
import com.ckd.calenderkhanado.data.network.model.LoginRequest;
import com.ckd.calenderkhanado.data.network.model.LoginResponse;


public class MainActivityPresenter extends BasePresenter<MainActivityContract.IMainView>
    implements MainActivityContract.MainPresenter {

  public MainActivityPresenter(Context context) {
    super(context);
  }


  @Override public void onSubmitButtonClicked() {
    mPreferenceManager.setCurrentUserName("Ganesh");

  }

  @Override public void onRetriveButtonClicked() {
    mView.setUserName(mPreferenceManager.getCurrentUserName());
  }

  @Override public void getDataFromAPI() {

    RetroClient.getRetroClient()
        .doLoginApiCall(new LoginRequest.ServerLoginRequest("rs@rs.rs", "rs"))
        .enqueue(new RemoteCallback<LoginResponse>() {
          @Override public void onSuccess(LoginResponse response) {

            if (!isViewAttached()) {
              return;
            }

            mPreferenceManager.setAccessToken(response.getAccessToken());

            mView.setUserName(response.getUserName());
          }

          @Override public void onFailed(Throwable throwable) {

            if (!isViewAttached()) {
              return;
            }
          }
        });
  }
}
