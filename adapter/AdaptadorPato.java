public class AdaptadorPato implements Galinha{
    public Pato pato;

    public AdaptadorPato(Pato pato){
        this.pato = pato;
    }

    @Override
    public String fazerCocorico(){
        return "COCORICÓ";
    }

    @Override
    public String voar(){
        return "*Galinha voando*";
    }
}
