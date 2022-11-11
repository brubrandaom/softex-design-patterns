public abstract class Veiculo{
    protected String modelo, marca, cor;
    protected int numRodas;

    public Veiculo(String modelo, String marca, String cor, int numRodas){  
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.numRodas = numRodas;
    }

    protected Veiculo(Veiculo veiculo){
        this.modelo = veiculo.modelo;
        this.marca = veiculo.marca;
        this.cor = veiculo.cor;
        this.numRodas = veiculo.numRodas;
    }

    public abstract Veiculo clone();

    public abstract void represent();    
}