package com.example.viniciusfarias.appcivicopostosdosine.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.listeners.buttonListenerPesquisar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by vinicius on 10/25/2016.
 */
public class SineCodActivity extends Activity{



    @BindView(R.id.etCodPosto) EditText codPosto;
    @BindView(R.id.btPesquisar) Button btPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinecod);

        ButterKnife.bind(this);

        btPesquisar.setOnClickListener(new buttonListenerPesquisar(this));

    }


    public EditText getCodPosto() {
        return codPosto;
    }

    public void setCodPosto(EditText codPosto) {
        this.codPosto = codPosto;
    }


}
