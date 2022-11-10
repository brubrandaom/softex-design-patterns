public class Factory {
    public static Computador criarComputador(String type, int ram, int hdd, float cpu){
        switch (type){
        case "PC":
            return new PC(ram, hdd, cpu);
        case "SERVER":
            return new SERVER(ram, hdd, cpu);
        default:
            return null;
        }
    }
}
