package com.example.viniciusfarias.appcivicopostosdosine.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vinicius on 10/25/2016.
 */
public class ConnectionServer {

    private static final String URL_BASES =

             "http://mobile-aceite.tcu.gov.br/mapa-da-saude/rest/";


    private static APIService service;
    private static ConnectionServer ourInstance = new ConnectionServer();

    public static ConnectionServer getInstance() {
        return ourInstance;
    }

    public APIService getService() {
        return service;
    }

    private ConnectionServer() {
        updateServiceAdress();
    }

    public void updateServiceAdress() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASES)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(APIService.class);
    }

}
