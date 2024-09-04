import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Linguagem Java");
        curso1.setDescricao("aulao de java");
        curso1.setCargaHorariaCurso(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Linguagem GO");
        curso2.setDescricao("Pos Graduacao em GO");
        curso2.setCargaHorariaCurso(360);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Tudo sobre Java");
        mentoria1.setDataMentoria(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descricao Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNomeDev("Jorge");
        dev1.inscreverBootcamp(bootCamp);

        System.out.println("Conteúdos Inscritos Jorge" + dev1.getConteudosInscricao());
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Jorge" + dev1.getConteudosInscricao());
        System.out.println("Conteúdos Concluídos Jorge" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("\n");

        Dev dev2 = new Dev();
        dev2.setNomeDev("Juliana");
        dev2.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Juliana" + dev2.getConteudosInscricao());
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Juliana" + dev2.getConteudosInscricao());
        System.out.println("Conteúdos Conclídos Juliana" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}
