package com.nareshgediya.kemchho.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIservice {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAynsKEdY:APA91bFIaF29N0bFFeP2GhH1LkEw2BAr4DXH1xCYtIWE_-Wy4exUIMwQ1coqNsBnmA0Co5a7g2rqB78_EcP9C3ge5H2Jj75Z8IHGAHF5dPLInGvHjW9r0u18YhhiDRXpLRTYjmro9bHI"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
