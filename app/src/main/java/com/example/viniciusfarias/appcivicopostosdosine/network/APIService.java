package com.example.viniciusfarias.appcivicopostosdosine.network;

import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by vinicius on 10/25/2016.
 */
public interface APIService {



    @GET("cod/{cod}")
    Call<List<PostoSine>> getSineCod(@Path("cod") String cod);

    @GET("latitude/-7.242662/longitude/-35.971605/raio/100")
    Call<List<PostoSine>> getSineCg();

    @GET
    Call<List<PostoSine>> getSineBr();

}
