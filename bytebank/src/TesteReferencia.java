public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 12);
        primeiraConta.setSaldo(200);

        System.out.println("A primeira conta tem " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;

        System.out.println("A segunda conta tem " + segundaConta.getSaldo());

        segundaConta.setSaldo(segundaConta.getSaldo()+100);

        System.out.println("A segunda conta tem " + segundaConta.getSaldo());

        System.out.println("A primeira conta tem " + primeiraConta.getSaldo());

        System.out.println(primeiraConta);
        System.out.println(segundaConta);//apontam para o mesmo classe
        // dentro dessa variavel nao tem um objeto mas sim uma referencia
        // se comparar eles no if, vai comparar a referencia e nao os valores dos objetos

    }
}
