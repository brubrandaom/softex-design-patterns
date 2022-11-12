public class Pepperoni extends SanduicheDecorator{
    
    public Pepperoni(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
        this.preco = 0.99f;
        this.nome = "Pepperoni";
    }

}