public class Onibus extends Veiculo{
    private int numBancos;
    
    public Onibus(String modelo, String marca, String cor, int numRodas, int numBancos){
        super(modelo, marca, cor, numRodas);
        this.numBancos = numBancos;
    }

    public Onibus(Onibus onibus){
        super(onibus);
        this.numBancos = onibus.numBancos;
    }

    @Override
    public Onibus clone() {
        return new Onibus(this);
    }

    @Override
    public void represent() {
        System.out.println("\nModelo: " + this.modelo + "\nMarca: " + this.marca + "\nCor: " + this.cor + "\nNúmero de rodas: " + this.numRodas + "\nNúmero de bancos: " + this.numBancos);;
    }

}
