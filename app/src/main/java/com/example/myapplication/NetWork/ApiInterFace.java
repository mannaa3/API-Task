package com.example.myapplication.NetWork;

import com.example.myapplication.model.MyListData;
import com.example.myapplication.model.User;
import com.example.myapplication.model.Login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterFace {
    @POST("account/Authenticate")
    public Call<User>login(@Body Login login);
  /*  @POST("account/Authenticate")
    public Call<accessToken>getAccessToken(@Body Login login);*/
    @POST("services/app/MemberWishlist/GetMyWishlist")
    Call<MyListData>getshowListInfo(@Header("Authorization")String authtoken);
}
