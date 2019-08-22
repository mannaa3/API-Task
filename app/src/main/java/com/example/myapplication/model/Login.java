package com.example.myapplication.model;

public class Login {
    private String UsernameOrEmailAddress,Password,accessToken;

    public Login(String sUsernameOrEmailAddress, String sPassword){

        this.UsernameOrEmailAddress=sUsernameOrEmailAddress;
        this.Password=sPassword;
     }

}
