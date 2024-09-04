package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    String tituloMentoria;
    String descricaoMentoria;
    LocalDate dataMentoria; //Uma das classes que podemos trabalhar com datas

    public String getTituloMentoria() {
        return tituloMentoria;
    }

    public void setTituloMentoria(String tituloMentoria) {
        this.tituloMentoria = tituloMentoria;
    }

    public String getDescricaoMentoria() {
        return descricaoMentoria;
    }

    public void setDescricaoMentoria(String descricaoMentoria) {
        this.descricaoMentoria = descricaoMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tituloMentoria='" + tituloMentoria + '\'' +
                ", descricaoMentoria='" + descricaoMentoria + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
