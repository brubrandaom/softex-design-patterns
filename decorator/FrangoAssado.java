public class FrangoAssado implements Sanduiche{
    private float preco;
    private String nome;
    
    public FrangoAssado(){
        this.preco = 4.50f;
        this.nome = "Sanduiche de frango assado";
    }
    
    @Override
    public float getPreco(){
        return this.preco;
    }
    
    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public String descricao(){
        return this.getNome() + " custa $" + this.getPreco();
    }
}

