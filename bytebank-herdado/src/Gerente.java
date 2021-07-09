public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

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
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }
}
