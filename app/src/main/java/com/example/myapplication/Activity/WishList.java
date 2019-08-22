package com.example.myapplication.Activity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.AdapterPackage.MyListAdapter;
import com.example.myapplication.NetWork.ApiInterFace;
import com.example.myapplication.R;
import com.example.myapplication.model.MyListData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WishList extends AppCompatActivity {
    MyListAdapter myListAdapter;

    RecyclerView news_rv;
    List<MyListData.Result> newsList;
    //   Bulid Retrofi Gate
    Retrofit.Builder builder=new Retrofit.Builder()
            .baseUrl("http://lensaty.net/api/")
            .addConverterFactory(GsonConverterFactory.create());
    Retrofit   retrofit=builder.build();
    ApiInterFace appApi=retrofit.create(ApiInterFace.class);
    //****************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_list);


}
    private void getinfo(String authtoken){
        Call<MyListData> call=appApi.getshowListInfo(authtoken);
        call.enqueue(new Callback<MyListData>() {
            @Override
            public void onResponse(Call<MyListData> call, Response<MyListData> response) {
                if (response.isSuccessful()){
                    MyListData myListData=response.body();

                    newsList=myListData.getResult();
                    initRecyclerView();


                    try {
                        Toast.makeText(WishList.this,"Respons is comming "+response.body(),Toast.LENGTH_LONG).show();
                    }catch (Exception u){
                        Toast.makeText(WishList.this,"EXCEPTION   ",Toast.LENGTH_LONG).show();

                    }

                }else {
                    Toast.makeText(WishList.this,"Falid to login try again   "+response.message(),Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<MyListData> call, Throwable t) {
                Toast.makeText(WishList.this,"Error :( "+t,Toast.LENGTH_LONG).show();

            }




        });
    }
    //  *************

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        news_rv.setLayoutManager(linearLayoutManager);
        news_rv.setItemAnimator(new DefaultItemAnimator());
        news_rv.setNestedScrollingEnabled(false);
        news_rv.setHasFixedSize(true);
        news_rv.scrollToPosition(0);
      //  myListAdapter = new MyListAdapter(this, newsList);
       // news_rv.setAdapter(newsAdapter2);
    }


}
