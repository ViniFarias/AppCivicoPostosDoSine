package com.example.viniciusfarias.appcivicopostosdosine.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.viniciusfarias.appcivicopostosdosine.R;
import com.example.viniciusfarias.appcivicopostosdosine.entitys.PostoSine;

import java.util.List;

/**
 * Created by vinicius on 10/25/2016.
 */
public class PostoSineAdapter extends BaseAdapter {

    Context context;
    List<PostoSine> postos;


    public PostoSineAdapter(Context context, List<PostoSine> postos) {
        this.context = context;
        this.postos = postos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater)  context.getSystemService(
                Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.activity_sinedetalhes, null);

            holder = new ViewHolder();
            holder.tvCodPosto = (TextView) convertView.findViewById(R.id.tvCodPosto);
            holder.tvNome = (TextView) convertView.findViewById(R.id.tvNome);
            holder.tvEntidadeConv = (TextView) convertView.findViewById(R.id.tvEntidadeConv);
            holder.tvEndereco = (TextView) convertView.findViewById(R.id.tvEndereco);
            holder.tvBairro = (TextView) convertView.findViewById(R.id.tvBairro);
            holder.tvCep = (TextView) convertView.findViewById(R.id.tvCep);
            holder.tvTelefone = (TextView) convertView.findViewById(R.id.tvTelefone);
            holder.tvMunicipio = (TextView) convertView.findViewById(R.id.tvMunicipio);
            holder.tvUf = (TextView) convertView.findViewById(R.id.tvUf);

            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }

        PostoSine postoSineItem = (PostoSine) getItem(position);

        holder.tvCodPosto.setText(postoSineItem.getCodPosto().toString());
        holder.tvNome.setText(postoSineItem.getNome().toString());
        holder.tvEntidadeConv.setText(postoSineItem.getEntidadeConveniada().toString());
        holder.tvEndereco.setText(postoSineItem.getEndereco().toString());
        holder.tvBairro.setText(postoSineItem.getBairro().toString());
        holder.tvCep.setText(postoSineItem.getCep().toString());
        holder.tvTelefone.setText(postoSineItem.getTelefone().toString());
        holder.tvMunicipio.setText(postoSineItem.getMunicipio().toString());
        holder.tvUf.setText(postoSineItem.getUf().toString());

        return convertView;
    }


    @Override
    public int getCount() {
        return postos.size();
    }

    @Override
    public Object getItem(int position) {
        return postos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return postos.indexOf(getItem(position));
    }

    /*private view holder class*/
    private class ViewHolder {

        TextView tvCodPosto;
        TextView tvNome;
        TextView tvEntidadeConv;
        TextView tvEndereco;
        TextView tvBairro;
        TextView tvCep;
        TextView tvTelefone;
        TextView tvMunicipio;
        TextView tvUf;
    }
}
