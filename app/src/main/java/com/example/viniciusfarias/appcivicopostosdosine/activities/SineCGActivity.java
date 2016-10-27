package com.example.viniciusfarias.appcivicopostosdosine.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.adapter.PostoSineAdapter;
import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;
import com.example.viniciusfarias.appcivicopostosdosine.network.ConnectionServer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by vinicius on 10/25/2016.
 */
public class SineCGActivity extends Activity{


    @BindView(R.id.lvPostoBr)
    ListView lvPostoBr;
    List<PostoSine> postos;
    PostoSineAdapter adapter;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinepostos);

        ButterKnife.bind(this);

        postos = new ArrayList<PostoSine>();
        adapter = new PostoSineAdapter(this, postos);

        lvPostoBr.setAdapter(adapter);

        listaPostosCg();

    }

    public void listaPostosCg() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                Call<List<PostoSine>> call = ConnectionServer.getInstance().getService().getSineCg();

                call.enqueue(new Callback<List<PostoSine>>() {
                    @Override
                    public void onResponse(Call<List<PostoSine>> call, Response<List<PostoSine>> response) {

                        try{

                            List<PostoSine> postosResponse = response.body();

                            postos.addAll(postosResponse);
                            adapter.notifyDataSetChanged();

                        }catch(Exception e){

                            Log.e("onResponse", "There is an error");
                            e.printStackTrace();

                        }
                    }

                    @Override
                    public void onFailure(Call<List<PostoSine>> call, Throwable t) {

                        Log.e("onFailure", "Erro");

                    }
                });
            }
        }).start();
    }
}
