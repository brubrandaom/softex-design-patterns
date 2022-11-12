public class SanduicheDecorator implements Sanduiche{
    protected Sanduiche sanduiche;
    protected float preco;
    protected String nome;
    
    @Override
    public float getPreco(){
        return this.preco + this.sanduiche.getPreco();
    }
    
    @Override
    public String getNome(){
        return this.sanduiche.getNome() + ", " + this.nome;
    }

    @Override
    public String descricao(){
        return this.getNome() + " custa $" + this.getPreco();
    }

}
