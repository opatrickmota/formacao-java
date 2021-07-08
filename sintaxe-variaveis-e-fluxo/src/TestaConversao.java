public class TestaConversao {
    public static void main(String[] args){
        double salario = 1250.70;
        int valor = (int) salario;

        System.out.println(valor);

        long inteiroGrande = 1564156465l;
        short valorPequeno = 1564;
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);
    }
}
