public class Main {
    public static void main(String[] args) {

        Conta ccrenato = new ContaCorrente(new Cliente("Renato"));
        Conta cprenato = new ContaPoupanca(new Cliente("Renato"));
        Conta cpcléo = new ContaPoupanca(new Cliente("cléo"));
        Conta ccleonardo = new ContaCorrente(new Cliente("Leonardo"));
        Conta cpleonardo = new ContaCorrente(new Cliente("Leonardo"));
        Conta ccrenata = new ContaCorrente(new Cliente("Renata"));


        ccrenato.depositar(100.55);
        ccrenato.transferir(50.42, cpcléo);

        ccrenato.imprimirExtrato();
        cpcléo.imprimirExtrato();

        //Lista de clientes do banco
        System.out.println(Banco.getClientes());

    }
}
