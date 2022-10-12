public class ContaCorrente extends  Conta{

    public ContaCorrente(){
        super.agencia = Conta.ID_AGENCIA;
        super.numero = Conta.ID_CONTA++;
    }
}
