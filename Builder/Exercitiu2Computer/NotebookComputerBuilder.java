//clasele efective declara ca implementeaza clasa generica de constructie, au obiectul in sine privat, instantiem un nou obiect pe care il returnam la sf si ii asignam valori prin override

public class NotebookComputerBuilder implements ComputerBuilder {
    private Computer computer;


    public NotebookComputerBuilder(){
        computer = new Computer();

    }

    @Override
    public void buildComputerType(){
        computer.setComputerType("Notebook computer");
    }
    
    @Override
    public void buildCpu(){
        computer.setCpu("Intel i1");
    }

    @Override
    public void buildRam(){
        computer.setRam(1);
    }

    @Override
    public void buildStorage(){
        computer.setStorage(256);
    }

    @Override
    public void buildManufacturingType(){
        computer.setManufacturing(false);
    }

    public Computer getComputer(){
        return computer;
    }

}

