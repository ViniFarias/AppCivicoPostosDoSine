package com.example.viniciusfarias.appcivicopostosdosine.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.listeners.buttonListener;

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

        btSineBrasil.setOnClickListener(new buttonListener(this, new SineBrasilActivity()));
        btSineCG.setOnClickListener(new buttonListener(this, new SineCGActivity()));
        btSineCod.setOnClickListener(new buttonListener(this, new SineCodActivity()));
    }
}
