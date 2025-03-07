//specific type of computer wed like to construct

public class GamingComputerBuilder implements ComputerBuilder {
    
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override 
    public void buildComputerType() {
        computer.setComputerType("Gaming computer");
    }

    @Override 
    public void buildCpu() {
        computer.setCpu("Intel core i23");
    }

    @Override 
    public void buildRam(){
        computer.setRam(64);
    }

    @Override
    public void buildStorage(){
        computer.setStorage(3096);
    }

    @Override 
    public void buildManufacturingType(){
        computer.setManufacturing(true);
    }

    public Computer getComputer(){
        return computer;
    }
}
