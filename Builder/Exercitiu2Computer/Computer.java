public class Computer {
    private String computerType;
    private String cpu;
    private int ram;
    private int storage;
    private boolean isChineseMade;


    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public  void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setManufacturing(boolean isChineseMade){
        this.isChineseMade = true;
    }

    public String toString(){
        return "Computer Type: " + computerType + "\n" +
                "Cpu: " + cpu + "\n" +
                "Ram: " + ram + "\n" +
                "Storage: " + storage + "\n" +
                "Manufacturing country: " + isChineseMade;
    }

}
