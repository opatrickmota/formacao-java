public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 12);
        conta.deposita(100);

        System.out.println(conta.getSaldo());

        boolean conseguiuRetirar = conta.saca(50);

        System.out.println(conta.getSaldo());

        Conta contaMarcela = new Conta(123, 12);
        contaMarcela.deposita(1000);

        if(contaMarcela.transfere(300, conta)){
            System.out.println("Sucesso na transferencia");
        }else{
            System.out.println("Faltou dinheiro na transferencia");
        }

        System.out.println("Conta Marcela: "+contaMarcela.getSaldo());

        System.out.println("Conta destino: "+conta.getSaldo());
    }
}
