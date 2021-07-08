public class Gerente extends Funcionario{
    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }
    //novo método, recebendo dois params. Isso é sobrecarga
    public boolean autentica(String login, int senha) {
        return true;
    }

    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificacao do Gerente");
        return super.getBonificacao() + super.getSalario();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
