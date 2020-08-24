package exercicio02;

public class ContaCorrente extends Conta{
    public ContaCorrente(int codConta, double saldo){
    super(codConta, saldo);
    }

    @Override
    public void saque(double saque) {
        if(super.getSaldo()-saque<0){
             System.out.println("Saldo insuficiente para o saque.");
        } else{
            super.saque(saque);
        }
    }

    @Override
    public void deposito(double deposito) {
        super.deposito(deposito-0.1);
    }

    @Override
    public void resumo() {
        System.out.println("### Conta Corrente ###");
        super.resumo();
    }
    
}