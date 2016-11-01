package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.content.Intent;
import android.view.View;

import com.example.viniciusfarias.appcivicopostosdosine.activities.MainActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCGActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCodActivity;

/**
 * Created by LADOSS on 31/10/2016.
 */

public class buttonListenerSineCG implements View.OnClickListener {

    MainActivity mainActivity;

    public buttonListenerSineCG(MainActivity mainActivity){

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this.mainActivity, SineCGActivity.class);
        this.mainActivity.startActivity(intent);

    }
}