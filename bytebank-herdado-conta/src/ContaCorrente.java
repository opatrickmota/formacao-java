public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero){//tenho que criar esse construtor pois a classe mãe tem um
        super(agencia, numero);// chamando o construtor da classe mãe
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
