package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){//tenho que criar esse construtor pois a classe mãe tem um
        super(agencia, numero);// chamando o construtor da classe mãe
    }

    @Override
    public void deposita(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() + 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }
}
