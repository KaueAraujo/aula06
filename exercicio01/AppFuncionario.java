package exercicio01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Joe", 153, 20);
        Senior sen1 = new Senior("Sett", 153, 20, 100);

        System.out.println(func1.imprimir());
        System.out.println(sen1.imprimir());
    }

}