package com.ckd.calenderkhanado.data.db;


import com.ckd.calenderkhanado.models.UserModel;

public interface IDbHelper {

    Long insertUser(final UserModel user);

    UserModel getUserModel();

    String getUserId();
}