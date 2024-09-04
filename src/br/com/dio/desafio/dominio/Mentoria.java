package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate dataMentoria; //Uma das classes que podemos trabalhar com datas

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tituloMentoria='" + super.getTitulo() + '\'' +
                ", descricaoMentoria='" + super.getDescricao() + '\'' +
                ", dataMentoria=" + this.getDataMentoria() +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
