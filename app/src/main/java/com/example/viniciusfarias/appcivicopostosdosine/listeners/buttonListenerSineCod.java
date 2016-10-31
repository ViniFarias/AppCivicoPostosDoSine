package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.content.Intent;
import android.view.View;

import com.example.viniciusfarias.appcivicopostosdosine.activities.MainActivity;
import com.example.viniciusfarias.appcivicopostosdosine.activities.SineCodActivity;

/**
 * Created by LADOSS on 31/10/2016.
 */

public class buttonListenerSineCod implements View.OnClickListener {

    MainActivity mainActivity;

    public buttonListenerSineCod(MainActivity mainActivity){

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this.mainActivity, SineCodActivity.class);
        this.mainActivity.startActivity(intent);

    }
}
