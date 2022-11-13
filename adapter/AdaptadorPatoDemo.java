public class AdaptadorPatoDemo {
    public static void main(String[] args) throws Exception {
        Pato qua = new Pato();
        Galinha quaAdaptado = new AdaptadorPato(qua);
        System.out.println(qua.fazerQuaQua());
        System.out.println(quaAdaptado.fazerCocorico());
        System.out.println(quaAdaptado.voar());
    }
}
