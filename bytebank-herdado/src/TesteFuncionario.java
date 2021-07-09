public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Gerente();
        nico.setCpf("1111.1111.111-11");
        nico.setNome("Nicolas");
        nico.setSalario(1205);

        System.out.println(nico.getNome());
    }
}
