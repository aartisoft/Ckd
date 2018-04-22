package com.ckd.calenderkhanado.activities.splashscreen;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.ckd.calenderkhanado.R;
import com.ckd.calenderkhanado.base.BaseActivity;

/**
 * Created by acer on 4/15/2018.
 */

public class SpashAcctivity extends BaseActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.splashscreen);
    }
}
