package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * @author Patrick Mota
 */

public abstract class Conta extends Object implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; // esse atributo agora é da classe modelo.Conta e nao mais dos seus objetos

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é "+total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não é permitido número negativo");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não é permitido número negativo");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: "+this.saldo + ", Valor: "+valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        saca(valor);
        destino.deposita(valor);
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(this.getAgencia() != outra.getAgencia() || this.getNumero() != outra.getNumero()){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero:  " + this.numero + ", Agencia: "+this.agencia + ", Saldo:" + this.saldo;
    }

    @Override
    public int compareTo(Conta outra){
        return Double.compare(this.saldo, outra.saldo);
    }
}
