package exercicio01;

public class Senior extends Funcionario{
    private double bonus;

    //Construtor
    public Senior(String nome, double horas, double valorHora, double bonus){
        super(nome, horas, valorHora);
        setBonus(bonus);
    }

    public void setBonus(double bonus){
        if(bonus>0){
            this.bonus=bonus;
        }
    }

    public double valorBonus(){
        return bonus*horas/10;
    }

    @Override
    public String imprimir() {
        return super.imprimir()+" Bonus: "+valorBonus();
    }
}