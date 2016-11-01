package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.example.viniciusfarias.appcivicopostosdosine.activities.SineBrasilActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCGActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineDetalhesActivity;
import com.example.viniciusfarias.appcivicopostosdosine.adapter.PostoSineCGAdapter;
import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;

/**
 * Created by Fanny on 31/10/2016.
 */
public class ListenerSineItem implements AdapterView.OnItemClickListener {


    SineCGActivity sineCGActivity;
    Context cont;

    public ListenerSineItem(Context cont){
        this.cont = cont;
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //Intent intent = new Intent(this.sineCGActivity, SineDetalhesActivity.class);
        Intent intent = new Intent(this.cont, SineDetalhesActivity.class);

        PostoSineCGAdapter adapter = sineCGActivity.getmAdapter();

        String codPosto = adapter.getItemSineCodPosto(position);


        Bundle codSine = new Bundle();
        codSine.putString("codSine", codPosto);
        intent.putExtras(codSine);

        this.cont.startActivity(intent);
    }

}
