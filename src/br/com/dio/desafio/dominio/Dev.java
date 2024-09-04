package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nomeDev;
    private Set<Conteudo> conteudosInscricao = new LinkedHashSet<>(); // Set não permite conteúdo repitido
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // Set não permite conteúdo repitido

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public Set<Conteudo> getConteudosInscricao() {
        return conteudosInscricao;
    }

    public void setConteudosInscricao(Set<Conteudo> conteudosInscricao) {
        this.conteudosInscricao = conteudosInscricao;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void increverBootcamp(BootCamp bootCamp){
        this.conteudosInscricao.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this); // dentro do bootcamp inscritos iremos adicionar o Dev
    }
    public void progredir(){
        Optional<Conteudo> conteudo =  this.conteudosInscricao.stream().findFirst();
        if(conteudo.isPresent()){  //isPresent retornara true se tiver conteúdo e false caso não tenha
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscricao.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }
    public double calcularXp(){  // estudar mais sobre stream lambda
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Dev dev)) return false;
        return Objects.equals(getNomeDev(), dev.getNomeDev()) && Objects.equals(getConteudosInscricao(), dev.getConteudosInscricao()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeDev(), getConteudosInscricao(), getConteudosConcluidos());
    }
}
