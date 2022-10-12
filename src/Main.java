public class Main {
    public static void main(String[] args) {
        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        corrente.depositar(30.50);
        corrente.depositar(5.30);
        corrente.imprimirExtrado();
        corrente.sacar(15);
        corrente.imprimirExtrado();

        poupanca.depositar(67.20);
        poupanca.depositar(86.30);
        poupanca.imprimirExtrado();
        poupanca.sacar(70);
        poupanca.imprimirExtrado();

        corrente.transferir(20,poupanca);
        corrente.imprimirExtrado();
        poupanca.imprimirExtrado();
    }
}