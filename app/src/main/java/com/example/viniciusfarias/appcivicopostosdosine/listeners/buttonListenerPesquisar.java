package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.viniciusfarias.appcivicopostosdosine.activities.MainActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCodActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineDetalhesActivity;

/**
 * Created by LADOSS on 31/10/2016.
 */

public class buttonListenerPesquisar implements View.OnClickListener{

    SineCodActivity sineCodActivity;

    public buttonListenerPesquisar(SineCodActivity sineCodActivity){

            this.sineCodActivity = sineCodActivity;

    }

    @Override
    public void onClick(View v){

            Intent intent = new Intent(this.sineCodActivity, SineDetalhesActivity.class);

            Bundle codSine = new Bundle();
            codSine.putString("codSine", sineCodActivity.getCodPosto().getText().toString());
            intent.putExtras(codSine);

            this.sineCodActivity.startActivity(intent);
    }
}