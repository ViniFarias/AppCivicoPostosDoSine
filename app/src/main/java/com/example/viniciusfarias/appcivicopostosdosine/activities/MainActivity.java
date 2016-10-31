package com.example.viniciusfarias.appcivicopostosdosine.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.listeners.buttonListenerSineBrasil;
import com.example.viniciusfarias.appcivicopostosdosine.listeners.buttonListenerSineCG;
import com.example.viniciusfarias.appcivicopostosdosine.listeners.buttonListenerSineCod;

import butterknife.ButterKnife;
import butterknife.BindView;

public class MainActivity extends Activity {

    @BindView(R.id.btSineBrasil) Button btSineBrasil;
    @BindView(R.id.btSineCG) Button btSineCG;
    @BindView(R.id.btSineCod) Button btSineCod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        btSineBrasil.setOnClickListener(new buttonListenerSineBrasil(this));
        btSineCG.setOnClickListener(new buttonListenerSineCG(this));
        btSineCod.setOnClickListener(new buttonListenerSineCod(this));
    }
}
