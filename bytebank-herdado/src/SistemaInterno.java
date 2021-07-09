public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel fa){
        boolean auntenticou = fa.autentica(this.senha);
        if(auntenticou){
            System.out.println("Pode entrar no sistema");
        }else{
            System.out.println("Não pode entrar no sistema");
        }
    }
}
