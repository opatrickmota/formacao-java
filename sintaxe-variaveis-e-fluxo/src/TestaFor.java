public class TestaFor {
    public static void main(String[] args) {

        for(int multiplicador = 0; multiplicador< 10; multiplicador++){
            System.out.println("Tabuado do "+multiplicador);
            for(int contador = 0; contador < 10 ; contador++){
                System.out.println(multiplicador +" * "+contador +" = "+ multiplicador*contador);
            }
        }

    }
}
