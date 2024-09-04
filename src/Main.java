import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTituloCurso("Linguagem Java");
        curso1.setDescricaoCurso("aulao de java");
        curso1.setCargaHorariaCurso(8);

        Curso curso2 = new Curso();
        curso2.setTituloCurso("Linguagem GO");
        curso2.setDescricaoCurso("Pos Graduacao em GO");
        curso2.setCargaHorariaCurso(360);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTituloMentoria("Mentoria Java");
        mentoria1.setDescricaoMentoria("Tudo sobre Java");
        mentoria1.setDataMentoria(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
