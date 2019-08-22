package com.example.myapplication.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NetWork.ApiInterFace;
import com.example.myapplication.R;
import com.example.myapplication.model.Login;
import com.example.myapplication.model.MyListData;
import com.example.myapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText  emailtext,passwordtext;
    String email,pass,temp,temp2;
    Button LogButton;
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
        setContentView(R.layout.activity_main);

         findViewById(R.id.logButton).setOnClickListener(new View.OnClickListener(){@Override public void onClick(View v){login(); }});


}
     public void login(){
         emailtext=(EditText)findViewById(R.id.email);
         passwordtext=(EditText)findViewById(R.id.pass);
        if(emailtext.getText().toString()==null&&passwordtext.getText().toString()==null){
            Toast.makeText(MainActivity.this,"Write E.Mail Or Password.",Toast.LENGTH_LONG).show();

        }else {
            email=emailtext.getText().toString();
            pass=passwordtext.getText().toString();
         Login login=new Login(email,pass);
         Call<User> call= (Call<User>) appApi.login(login);
         call.enqueue(new Callback<User>() {
             @Override
             public void onResponse(Call<User> call, Response<User> response) {
                   if (response.isSuccessful()){
                         User user=response.body();
                        //  temp= new User.Result().getAccessToken();
                       temp="Bearer "+user.getResult().getAccessToken();
                       Toast.makeText(MainActivity.this,"  List   \n "+newsList,Toast.LENGTH_LONG).show();

                     /*  Intent i=new Intent(MainActivity.this,WishList.class);
                      i.putExtra("temp",temp);
                      startActivity(i);*/
                     //  Toast.makeText(MainActivity.this,"Token Is ok5555 "+temp,Toast.LENGTH_LONG).show();
                     }else {
                       Toast.makeText(MainActivity.this,"Your E.Mail Or Password is Wrong .",Toast.LENGTH_LONG).show();

                   }
             }

             @Override
             public void onFailure(Call<User> call, Throwable t) {
                 Toast.makeText(MainActivity.this,"Error NetWorking  :( ",Toast.LENGTH_LONG).show();
              }
         });
}}


    public static class list_item extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_item);
        }
    }
}