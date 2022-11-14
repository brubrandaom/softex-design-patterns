import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Contexto contexto = new Contexto();
        int a, b, resultado;
        char op;
        
        System.out.println("Primeiro número: ");
        a = input.nextInt();
        System.out.println("Segundo número: ");
        b = input.nextInt();
        System.out.println("Operação: ");
        op = input.next().charAt(0);

        if (op == '+'){
            contexto.setStrategy(new Soma());
        }else if (op == '-'){
            contexto.setStrategy(new Subtracao());
        }else if (op == '*'){
            contexto.setStrategy(new Multiplicacao());
        }

        resultado = contexto.executeStrategy(a, b);
        System.out.println(resultado);
        
    }
}
