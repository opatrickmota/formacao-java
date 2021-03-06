public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaExcecao ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");

        //ArithmeticException ex = new ArithmeticException("Deu errado");
        //throw ex; // Jogando uma exceção
        throw new MinhaExcecao("Minha exceção - Aviso de erro");

        //System.out.println("Fim do metodo2");
    }
}