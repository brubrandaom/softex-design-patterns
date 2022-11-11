public class Carro extends Veiculo{
    private int ano;
    
    public Carro(String modelo, String marca, String cor, int numRodas, int ano){
        super(modelo, marca, cor, numRodas);
        this.ano = ano;
    }

    public Carro(Carro carro){
        super(carro);
        this.ano = carro.ano;
    }

    @Override
    public Carro clone() {
        return new Carro(this);
    }

    @Override
    public void represent() {
        System.out.println("\nModelo: " + this.modelo + "\nMarca: " + this.marca + "\nCor: " + this.cor + "\nNúmero de rodas: " + this.numRodas + "\nAno: " + this.ano);;
    }

    
    
}
