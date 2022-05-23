public abstract class Conta  implements ContaInterface{
    protected static final int AGENCIA_PADRAO=1 ;
    private static int SEQUENCIAL=1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia=AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo +=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirIfoComuns(){
        System.out.println(cliente.getNome());
        System.out.println("Conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
