package exercicio02;

public class Conta {
    //Atributos da super classe
    private int codConta;
    private double saldo;

    //Construtor
    public Conta(int codConta, double saldo){
        setidConta(codConta);
        setSaldo(saldo);
    }

    public int getidConta(){
        return codConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setidConta(int codConta){
        if(codConta>0){
            this.codConta = codConta;
        }
    }
    public void setSaldo(double saldo){
        if(saldo>0){
            this.saldo=saldo;
        }else{
            saldo=0;
        }
    }

    //Método Saque
    public void saque(double saque){
        saldo-=saque;
    }

    //Método Depósito
    public void deposito(double deposito){
        saldo+=deposito;
    }

    //Método Resumo
    public void resumo(){
        System.out.println("Código da conta: "+codConta);
        System.out.printf("Saldo disponível: R$%.2f%n",saldo);
    }


}