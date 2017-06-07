package com.example.silas.parenteye.Service;

import com.example.silas.parenteye.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by silas on 5/25/17.
 */

public interface Login {
    @FormUrlEncoded
    @POST("Login")
    Call<User> Userlogin(@Field("UserName") String userName,@Field("Password") String password);
}
