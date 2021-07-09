public class Gerente extends FuncionarioAutenticavel{

    //novo método, recebendo dois params. Isso é sobrecarga
    public boolean autentica(String login, int senha) {
        return true;
    }

    public double getBonificacao(){
        System.out.println("Chamando o metodo de bonificacao do Gerente");
        return super.getSalario();
    }

}
