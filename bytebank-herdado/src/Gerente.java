public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    //novo método, recebendo dois params. Isso é sobrecarga
    public boolean autentica(String login, int senha) {
        return true;
    }

    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificacao do Gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
