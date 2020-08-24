package exemplo01;

public class Funcionario {
    //Atributos
    protected String nome; //Pode acessar por classes no mesmo pacote.
    protected double salario;

    //Construtor 1
    public Funcionario(){
        salario=0;
    }

    //Construtor 2 - OVERLOAD (Duas formas para o mesmo método)
    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }

    //Metodo 1) Acessar nome
    public String getName(){
        return nome;
    }
    //Metodo 2) Alterar nome
    public void setName(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario >0){
            this.salario = salario;
        }

    }
    public String imprimir(){
        return "Funcionario: "+nome+" Salário: "+ String.format("%.2f",salario);
    }

    // Metodo para aumentar o salario
    public void aumentaSalario(double perc){
        salario=salario*(1+perc/100);
    }
}