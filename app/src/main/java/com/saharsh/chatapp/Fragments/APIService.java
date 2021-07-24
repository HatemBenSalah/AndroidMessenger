package com.saharsh.chatapp.Fragments;

import com.saharsh.chatapp.Notifications.MyResponse;
import com.saharsh.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAxFumUzk:APA91bHKqMocSHmSBnAF4Z65YMqtsOJR1GRVA7xfE7QzdQlKfFKCKHwJ_uAvAf8_bIwBDgdPHtOn9jpBii8weO06hds-b3w5H_Cre-9ipnn-ZG5gHn9DnbxittzZpSFNmPd6lm4D5sTZ"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
