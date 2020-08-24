package exercicio01;

public class Funcionario {
    private String nome;
    protected double horas, valorHora;

    //Construtor
    public Funcionario(String nome, double horas, double valorHora){
        this.nome=nome;
        this.horas=horas;
        setvalorHora(valorHora);
    }

    public String getName(){
        return nome;
    }

    public void setvalorHora(double valorHora){
        if(valorHora>0){
            this.valorHora=valorHora;
        }
    }

    //Metodo 1)
    public double recebimento(){
        return horas*valorHora;
    }

    //Metodo 2)
    public String imprimir(){
        return "Funcionario: "+nome+" Horas Trabalhadas: "+horas+" Salário final: "+recebimento();
    }
}