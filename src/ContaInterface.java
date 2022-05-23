public interface ContaInterface {

    public void sacar( double valor);

    public  void depositar(double valor);

    public void transferir(double valor, Conta ContaDestino);

    public void imprimirExtrato();
}
