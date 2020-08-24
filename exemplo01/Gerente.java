package exemplo01;

public class Gerente extends Funcionario{
    //Atributos exclusivos do gerente
    private int nFuncionarios;
    private double bonus;

    public Gerente(String nome, double salario,int nFuncionarios){
        super(nome,salario);//Chama o construtor da super classe
        setnFunc(nFuncionarios);
    }

    public int getnFunc(){
        return nFuncionarios;
    }

    public void setnFunc(int nFuncionarios){
        if(nFuncionarios>0){
            this.nFuncionarios=nFuncionarios;
        }
    }

    @Override
    public String imprimir(){
        //Forma 1: Acesso diretamente um dado protected, um método publico e uma variavel local
        //return "Funcionario: "+ nome +"Salário: "+getSalario()+"NºFuncionarios : "+nFuncionarios;

        //Forma 2: Utilizar o metodo da classe base a adicionar o que for diferente
        return super.imprimir() + " Nº Funcionarios: "+nFuncionarios+" Bonus: "+bonus;
    }

    @Override
    public void aumentaSalario(double perc){
        this.bonus=getSalario()*0.2;
        super.aumentaSalario(perc);
    }
}