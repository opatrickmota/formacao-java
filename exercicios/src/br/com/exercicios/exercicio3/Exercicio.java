package br.com.exercicios.exercicio3;

import br.com.exercicios.objeto.Elevador;
import br.com.exercicios.objeto.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio {
    private Elevador elevador;

    public Exercicio(int capacidadeDoElevador, int totalDeAndares) {
        elevador = new Elevador();
        elevador.setCapacidadeDoElevador(capacidadeDoElevador);
        elevador.setTotalDeAndares(totalDeAndares);
    }

    public void entra(Pessoa pessoa){
        if(elevador.getCapacidadeDoElevador() <= elevador.getPessoas().size()){
            System.out.println("O elevador está cheio!");
            return;
        }
        elevador.setPessoas(pessoa);
        System.out.println("O total de pessoas no andar agora é de " + elevador.getPessoas().size()+ " pessoa(s)");
    }

    public void sai(Pessoa pessoa){
        if(elevador.getPessoas().size() == 0){
            System.out.println("Não há ninguém no elevador!");
            return;
        }

        List<Pessoa> pessoasEncontradas = elevador.getPessoas()
                .stream()
                .filter(p ->
                        p.getNome().compareTo(pessoa.getNome()) == 0
                                && p.getAltura().compareTo(pessoa.getAltura()) == 0
                                && p.getIdade() == pessoa.getIdade()
                )
                .collect(Collectors.toList());

        if (!pessoasEncontradas.isEmpty()){
            elevador.getPessoas().remove(pessoasEncontradas.get(0));
        }
        System.out.println("O total de pessoas no andar agora é de " + elevador.getPessoas().size() + " pessoa(s)");
    }

    public void sobe(){
        if(elevador.getAndarAtual() == elevador.getTotalDeAndares()){
            System.out.println("Você já está no último andar!");
            return;
        }
        elevador.setAndarAtual(elevador.getAndarAtual()+1);
        System.out.println("Você agora está no andar: " + elevador.getAndarAtual());
    }

    public void desce(){
        if(elevador.getAndarAtual() == 0){
            System.out.println("Você já está no térreo!");
            return;
        }
        elevador.setAndarAtual(elevador.getAndarAtual()-1);
        System.out.println("Você agora está no andar: " + elevador.getAndarAtual());
    }

    public void imprimePessoasNoElevador(){
        System.out.println("Pessoas no elevador");
        elevador.getPessoas().forEach(pessoa -> {
            System.out.println(pessoa.getNome());
        });
    }
}
