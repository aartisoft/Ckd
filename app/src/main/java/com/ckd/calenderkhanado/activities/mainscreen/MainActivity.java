package com.ckd.calenderkhanado.activities.mainscreen;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


import com.ckd.calenderkhanado.R;
import com.ckd.calenderkhanado.base.BaseActivity;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<MainActivityPresenter> implements
    MainActivityContract.IMainView {

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    @BindView(R.id.textView2) TextView mText;

    @Override protected void onCreate(Bundle savedInstanceState) {
        mPresenter = new MainActivityPresenter(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override public void setUserName(String mUserName) {
        mText.setText(mUserName);
    }
}
