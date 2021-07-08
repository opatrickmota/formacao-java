public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 12);
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(123, 12);
        segundaConta.setSaldo(30);

        System.out.println("A primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("A segunda conta tem " + segundaConta.getSaldo());

        System.out.println(primeiraConta.getAgencia());
    }
}
