public class App {
    public static void main(String[] args) throws Exception {
        Sanduiche x = new FrangoAssado();
        x = new Pepperoni(x);
        x = new QueijoMussarelaRalado(x);
        System.out.println(x.descricao());
    }
}
