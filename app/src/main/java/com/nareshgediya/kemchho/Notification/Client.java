package com.nareshgediya.kemchho.Notification;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static Retrofit retrofit;

    public static  Retrofit getClient(String url){
        if (retrofit == null){
retrofit = new Retrofit
        .Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

            Log.d("LOG","NEW RETROFIT" );
        }
        return  retrofit;
    }
}
