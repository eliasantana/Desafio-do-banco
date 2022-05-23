import java.util.*;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return nome.equals(banco.nome) && contas.equals(banco.contas);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contas);
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirListaDeCliente() {
        if (this.contas.size() > 0) {
            System.out.println("======== IMPRIMINDO LISTA DE CLIENTES ==============");
            for (Conta c : contas) {
                System.out.println(c.cliente.getNome());
            }
        } else {
            System.out.println("Não há clientes para exibir");
        }
    }

    public void imprimirListaDeCliente(List<Conta> contas) {
        if (this.contas.size() > 0) {
            System.out.println("======== IMPRIMINDO LISTA DE CLIENTES ==============");
            Set<Conta> listaDeContas = new TreeSet<>(new CompareContaNomeCliente());
            listaDeContas.addAll(contas);
            for (Conta c : listaDeContas) {
                System.out.println(c.cliente.getNome());
            }
        } else {
            System.out.println("Não há clientes para exibir");
        }
    }
}

class CompareContaNomeCliente implements Comparator<Conta>{
    @Override
    public int compare(Conta c1, Conta c2) {
        int nome = c1.cliente.getNome().compareToIgnoreCase(c2.cliente.getNome());

       return nome;
    }
}
