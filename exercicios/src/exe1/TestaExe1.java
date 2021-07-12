package exe1;

public class TestaExe1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.65);
        pessoa.setNome("Aline");
        pessoa.setDataNascimento("01/05/2005");

        pessoa.imprimirDados();
        pessoa.calcularIdade();

    }
}
