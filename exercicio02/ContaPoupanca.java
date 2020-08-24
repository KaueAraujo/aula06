package exercicio02;

public class ContaPoupanca extends Conta{
    private double taxa;
    public ContaPoupanca(int codConta, double saldo, double taxa){
        super(codConta, saldo);
        setTaxa(taxa);
    }

    public void setTaxa(double taxa){
        if(taxa>0){
            this.taxa=taxa;
        }
    }

    @Override
    public void saque(double saque) {
        if(super.getSaldo()-taxa-saque<0){
            System.out.println("Saldo insuficiente para o saque.");
        }else{
            super.saque(saque+taxa);
        }
    }

    @Override
    public void resumo() {
        System.out.println("### Conta Poupança ###");
        super.resumo();
        System.out.println("Taxa para saque: "+taxa);
    }
}