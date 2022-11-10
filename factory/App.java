public class App {
    public static void main(String[] args) throws Exception {
        Computador x = Factory.criarComputador("PC", 16, 400, 3.2f);
        Computador y = Factory.criarComputador("SERVER", 16, 400, 3.2f);
        System.out.println(x.toString());
        System.out.println(y.toString());
    }
}
