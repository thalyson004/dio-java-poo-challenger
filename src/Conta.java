public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected static int ID_AGENCIA = 1;
    protected static int ID_CONTA = 1;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void transferir(double valor, Conta conta){
        sacar(valor);
        conta.depositar(valor);
    }

    public void imprimirExtrado(){
        System.out.println("====== EXTRADO =====");
        System.out.printf("CONTA %s\nAGENCIA %s\n%n", numero, agencia);
        System.out.printf("Saldo R$ %.2f\n", saldo);
        System.out.println("====================");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
