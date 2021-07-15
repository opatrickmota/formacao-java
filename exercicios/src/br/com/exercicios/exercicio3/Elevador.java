package br.com.exercicios.exercicio3;

public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int pessoasNoElevador;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }

    public void inicializa(int capacidadeDoElevador, int totalDeAndares){
        setCapacidadeDoElevador(capacidadeDoElevador);
        setTotalDeAndares(totalDeAndares);
        setAndarAtual(0);
        setPessoasNoElevador(0);
    }

    public void entra(){
        if(getCapacidadeDoElevador() <= getPessoasNoElevador()){
            System.out.println("O elevador está cheio!");
            return;
        }
        setPessoasNoElevador(getPessoasNoElevador()+1);
        System.out.println("O total de pessoas no andar agora é de " + getPessoasNoElevador() + " pessoa(s)");
    }

    public void sai(){
        if(getPessoasNoElevador()<=0){
            System.out.println("Não há ninguém no elevador!");
            return;
        }
        setPessoasNoElevador(getPessoasNoElevador()-1);
        System.out.println("O total de pessoas no andar agora é de " + getPessoasNoElevador() + " pessoa(s)");
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



























}
