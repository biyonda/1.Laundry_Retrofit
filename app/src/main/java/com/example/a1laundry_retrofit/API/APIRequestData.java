package com.example.a1laundry_retrofit.API;

import com.example.a1laundry_retrofit.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {

    @GET("retrieve.php")
    Call<ResponseModel> ardRetrieveData();

}
