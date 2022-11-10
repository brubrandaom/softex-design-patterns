public class PC implements Computador{
    private int ram, hdd;
    private float cpu;
    private String type;

    public PC(int ram, int hdd, float cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.type = "PC";
    }

    @Override
    public float getCpu() {
        return this.cpu;
    }

    @Override
    public int getHdd() {
        return this.hdd;
    }

    @Override
    public int getRam() {
        return this.ram;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "\nComputador tipo: " + this.getType() + "\nRAM: " + this.getRam() + " GB\nHDD: " + this.getHdd() + " GB\nCPU: " + this.getCpu() + " GHz";
    }
        
}
