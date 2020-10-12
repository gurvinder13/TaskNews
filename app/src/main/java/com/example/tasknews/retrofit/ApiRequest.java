package com.example.tasknews.retrofit;


import com.example.tasknews.response.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {

    @GET("v2/everything/")
    Call<ArticleResponse> getNewsArticles(
            @Query("q") String query,
            @Query("apikey") String apiKey
    );
}
