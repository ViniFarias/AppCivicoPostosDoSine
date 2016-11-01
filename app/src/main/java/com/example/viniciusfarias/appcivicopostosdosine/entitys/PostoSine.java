package com.example.viniciusfarias.appcivicopostosdosine.entitys;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vinicius on 10/25/2016.
 */
public class PostoSine {

    private String codPosto;
    private String nome;
    private String entidadeConveniada;
    private String endereco;
    private String bairro;
    private String cep;
    private String telefone;
    private String municipio;
    private String uf;

    @SerializedName("lat")
    private String latitude;

    @SerializedName("long")
    private String longitude;

    public PostoSine(String codPosto, String nome, String entidadeConveniada, String endereco, String bairro, String cep,
                     String telefone, String municipio, String uf, String latitude, String longitude){

        this.codPosto = codPosto;
        this.nome = nome;
        this.entidadeConveniada = entidadeConveniada;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.municipio = municipio;
        this.uf = uf;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public PostoSine(){

    }

    public String getNome() {
        return nome;
    }

    public String getCodPosto() {
        return codPosto;
    }

    public String getEntidadeConveniada() {
        return entidadeConveniada;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setCodPosto(String codPosto) {
        this.codPosto = codPosto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEntidadeConveniada(String entidadeConveniada) {
        this.entidadeConveniada = entidadeConveniada;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
