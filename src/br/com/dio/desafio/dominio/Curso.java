package br.com.dio.desafio.dominio;

public class Curso {
    private String tituloCurso;
    private String descricaoCurso;
    private int cargaHorariaCurso;

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    public int getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tituloCurso='" + tituloCurso + '\'' +
                ", descricaoCurso='" + descricaoCurso + '\'' +
                ", cargaHorariaCurso=" + cargaHorariaCurso +
                '}';
    }
}
