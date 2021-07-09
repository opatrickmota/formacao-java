public class TestaReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSalario(5000);
        g1.setNome("Patrick");
        System.out.println(g1.getNome());

        EditorVideo ev = new EditorVideo();
        ev.setSalario(1200);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
