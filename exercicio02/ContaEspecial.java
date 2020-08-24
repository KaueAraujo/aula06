package exercicio02;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int codConta, double saldo, double limite){
        super(codConta, saldo);
        setLimite(limite);
    }

    public void setLimite(double limite){
        if(limite>0){
            this.limite=limite;
        }
    }

    @Override
    public void saque(double saque) {
        if(super.getSaldo()+limite-saque<0){
            System.out.println("Saldo insuficiente para o saque.");
        }else{
            if(super.getSaldo()<saque){
                limite=limite-saque+super.getSaldo();
                super.saque(super.getSaldo());
            }else{
                super.saque(saque);
            }
        }
        
    }

    @Override
    public void resumo() {
        System.out.println("### Conta Especial ###");
        super.resumo();
        System.out.println("Limite da Conta: R$"+limite);
    }
}