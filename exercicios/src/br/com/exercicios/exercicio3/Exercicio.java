package br.com.exercicios.exercicio3;

import br.com.exercicios.objeto.Elevador;
import br.com.exercicios.objeto.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio extends Elevador {

    public Exercicio(int capacidadeDoElevador, int totalDeAndares) {
        setCapacidadeDoElevador(capacidadeDoElevador);
        setTotalDeAndares(totalDeAndares);
    }

    public void entra(Pessoa pessoa){
        if(getCapacidadeDoElevador() <= getPessoas().size()){
            System.out.println("O elevador está cheio!");
            return;
        }
        setPessoas(pessoa);
        System.out.println("O total de pessoas no andar agora é de " + getPessoas().size()+ " pessoa(s)");
    }

    public void sai(Pessoa pessoa){
        if(getPessoas().size() == 0){
            System.out.println("Não há ninguém no elevador!");
            return;
        }

        List<Pessoa> pessoasEncontradas = getPessoas()
                .stream()
                .filter(p ->
                        p.getNome() == pessoa.getNome()
                )
                .collect(Collectors.toList());

        if (!pessoasEncontradas.isEmpty()){
            getPessoas().remove(pessoasEncontradas.get(0));
        }
        System.out.println("O total de pessoas no andar agora é de " + getPessoas().size() + " pessoa(s)");
    }

    public void sobe(){
        if(getAndarAtual() == getTotalDeAndares()){
            System.out.println("Você já está no último andar!");
            return;
        }
        setAndarAtual(getAndarAtual()+1);
        System.out.println("Você agora está no andar: " + getAndarAtual());
    }

    public void desce(){
        if(getAndarAtual() == 0){
            System.out.println("Você já está no térreo!");
            return;
        }
        setAndarAtual(getAndarAtual()-1);
        System.out.println("Você agora está no andar: " + getAndarAtual());
    }

    public void imprimePessoasNoElevador(){
        System.out.println("Pessoas no elevador");
        getPessoas().forEach(pessoa -> {
            System.out.println(pessoa.getNome());
        });
    }
}
