package exemplo01;

public class App {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario("Jose",2000);
        Gerente ger1 = new Gerente("Kaue",3000,12);

        func1.setName("Alberto");
        String nome = func1.getName();
        System.out.println("Funcionario 1: "+nome);

        ger1.setName("Martin");
        nome = ger1.getName();
        System.out.println("Gerente: "+ nome);
        
        System.out.println("Funcionario 2: "+func2.getName());

        System.out.println(func2.imprimir());
        System.out.println(ger1.imprimir());

        func2.aumentaSalario(10);
        System.out.println(func2.imprimir());

        ger1.aumentaSalario(10);
        System.out.println(ger1.imprimir());


    }
}