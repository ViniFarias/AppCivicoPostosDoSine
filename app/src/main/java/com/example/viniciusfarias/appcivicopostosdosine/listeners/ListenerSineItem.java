package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

import com.example.viniciusfarias.appcivicopostosdosine.activities.SineBrasilActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCGActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineDetalhesActivity;
import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;

/**
 * Created by Fanny on 31/10/2016.
 */
public class ListenerSineItem implements AdapterView.OnItemClickListener {


    SineCGActivity sineCGActivity;

    public ListenerSineItem(SineCGActivity sineCGActivity){
        this.sineCGActivity = sineCGActivity;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this.sineCGActivity, SineDetalhesActivity.class);

        RecyclerView.Adapter adapter = sineCGActivity.getmAdapter();

        PostoSine postoSine = adapter.getItem(position);


       /* Bundle codSine = new Bundle();
        codSine.putString("codSine", sineCGActivity.getCodPosto().getText().toString());
        intent.putExtras(codSine);*/

        this.sineCodActivity.startActivity(intent);



    }
}
