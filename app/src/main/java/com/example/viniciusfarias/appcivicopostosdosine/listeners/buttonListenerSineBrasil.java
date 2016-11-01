package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.content.Intent;
import android.view.View;

import com.example.viniciusfarias.appcivicopostosdosine.activities.MainActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineBrasilActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCodActivity;

/**
 * Created by LADOSS on 31/10/2016.
 */

public class buttonListenerSineBrasil implements View.OnClickListener {


    MainActivity mainActivity;

    public buttonListenerSineBrasil(MainActivity mainActivity){

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this.mainActivity, SineBrasilActivity.class);
        this.mainActivity.startActivity(intent);

    }
}