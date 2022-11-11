public class App {

    private static Veiculo[] clonarArray(Veiculo[] array){
        Veiculo[] clone = new Veiculo[6];
            for (int i = 0; i<6; i++){
                clone[i] = array[i].clone();
            }
            return clone;
        }
    public static void main(String[] args) throws Exception {
        Veiculo v[] = new Veiculo[6];
        v[0] = new Carro("L200", "Mitsubishi", "Prata", 4, 2018);
        v[1] = v[0].clone();
        v[2] = v[0].clone();
        v[3] = new Onibus("Mercedes-Benz", "Mercedes", "Branco", 8, 50);
        v[4] = v[3].clone();
        v[5] = v[3].clone();

        Veiculo v2[] = clonarArray(v);

        for (int i = 0; i<6; i++){
            v2[i].represent();
        }
    }
    
}
