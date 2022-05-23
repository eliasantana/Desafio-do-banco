import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        List<Conta> contas = new LinkedList<>();

        Cliente elias = new Cliente();
        elias.setNome("Elias Santana");

        Conta cc = new ContaCorrente(elias);
        cc.depositar(100);
        cc.depositar(100);
        cc.sacar(10);
        cc.imprimirExtrato();

        Cliente madally = new Cliente();
        madally.setNome("Madally");

        Conta cp = new ContaPoupanca(madally);
        cp.depositar(100);
        cp.sacar(20);
        cp.imprimirExtrato();

        cc.transferir(20,cp);
        cp.imprimirExtrato();

        Cliente antonio = new Cliente();
        antonio.setNome("Antonio");
        Conta cp2 = new ContaPoupanca(antonio);
        cp2.depositar(1200);
        cp2.sacar(30);
        cp2.imprimirExtrato();


        contas.add(cc);
        contas.add(cp);
        contas.add(cp2);

        banco.setContas(contas);
        banco.imprimirListaDeCliente(contas);

    }
}
