public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        super.agencia = Conta.ID_AGENCIA;
        super.numero = Conta.ID_CONTA++;
    }
}
