package com.example.viniciusfarias.appcivicopostosdosine.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;
import com.example.viniciusfarias.appcivicopostosdosine.network.ConnectionServer;

import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SineDetalhesActivity extends Activity {

    Bundle codSine;

    @BindView(R.id.tvCodPosto) TextView tvCodPosto;
    @BindView(R.id.tvBairro) TextView tvBairro;
    @BindView(R.id.tvCep) TextView tvCep;
    @BindView(R.id.tvEndereco) TextView tvEndereco;
    @BindView(R.id.tvEntidadeConv) TextView tvEntidadeConv;
    @BindView(R.id.tvMunicipio) TextView tvMunicipio;
    @BindView(R.id.tvNome) TextView tvNome;
    @BindView(R.id.tvUf) TextView tvUf;
    @BindView(R.id.tvTelefone) TextView tvTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinedetalhes);

        codSine = getIntent().getExtras();
        String codPostoSine = codSine.getString("codSine");

        getSineDetalhes(codPostoSine);

    }


    public void getSineDetalhes(final String codSine){

            new Thread(new Runnable() {

                @Override
                public void run() {

                    ConnectionServer.getInstance().getService().getSineCod(codSine);

                    Call<List<PostoSine>> call = ConnectionServer.getInstance().getService().getSineCod(codSine);

                    Log.i(this.getClass().getName(), "Realizando chamada ao serviço de listagem");

                    call.enqueue(new Callback<List<PostoSine>>() {
                        @Override
                        public void onResponse(Call<List<PostoSine>> call, Response<List<PostoSine>> response) {

                            try{

                                if(response.isSuccessful()){
                                    List<PostoSine> sines = response.body();

                                    PostoSine postoSine = sines.get(0);

                                   tvNome.setText(postoSine.getNome());
                                   tvBairro.setText(postoSine.getBairro());
                                   tvCep.setText(postoSine.getCep());
                                   tvCodPosto.setText(postoSine.getCodPosto());
                                   tvEntidadeConv.setText(postoSine.getEntidadeConveniada());
                                   tvTelefone.setText(postoSine.getTelefone());
                                   tvMunicipio.setText(postoSine.getMunicipio());
                                   tvUf.setText(postoSine.getUf());
                                   tvEndereco.setText(postoSine.getEndereco());

                                }
                                else{
                                    Log.e(this.getClass().toString(), "Erro na chamada "+ response.code());
                                }
                            }
                            catch (Exception e){
                                Log.e(this.getClass().toString(), e.getMessage().toString());
                            }
                        }

                        @Override
                        public void onFailure(Call<List<PostoSine>> call, Throwable t) {
                            Log.e("onFailure", "Erro"+ t.getMessage());
                        }
                    });
                }
            }).start();
    }
}
