package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHorariaCurso;

    public int getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tituloCurso='" + super.getTitulo() + '\'' +
                ", descricaoCurso='" + super.getDescricao() + '\'' +
                ", cargaHorariaCurso=" + this.getCargaHorariaCurso() +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.getCargaHorariaCurso();
    }
}
