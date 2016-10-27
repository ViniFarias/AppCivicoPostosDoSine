package com.example.viniciusfarias.appcivicopostosdosine.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.example.viniciusfarias.appcivicopostosdosine.activities.MainActivity;

/**
 * Created by vinicius on 10/25/2016.
 */
public class buttonListener implements View.OnClickListener {

    MainActivity mainActivity;
    Activity nextActivity;

    public buttonListener(MainActivity mainActivity, Activity nextActivity){

        this.mainActivity = mainActivity;
        this.nextActivity = nextActivity;

    }

    public void onClick(View view){

        Intent intent = new Intent(mainActivity.getBaseContext(), nextActivity.getClass());

    }
}
