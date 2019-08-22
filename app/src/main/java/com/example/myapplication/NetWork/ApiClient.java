package com.example.myapplication.NetWork;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit = null;

   public static Retrofit getClient() {

       /* HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
*/

        retrofit = new Retrofit.Builder()
                .baseUrl("http://lensaty.net/api")
                .addConverterFactory(GsonConverterFactory.create())
                //.client(client)
                .build();



        return retrofit;
    }

}
/*
    private static Retrofit retrofit = null;

     public Retrofit get(){
         retrofit = new Retrofit.Builder()
                 .baseUrl("http://lensaty.net/api/")
                 .addConverterFactory(GsonConverterFactory.create())
                  .build();



         return retrofit;


         /*
     Retrofit.Builder builder=new Retrofit.Builder()
            .baseUrl("http://lensaty.net/api/")
            .addConverterFactory(GsonConverterFactory.create())
             .build();
    Retrofit   retrofit=builder.build();
     ApiInterFace appApi=retrofit.create(ApiInterFace.class);*/
    /* }
}
*/