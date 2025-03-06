public class ConcreteComputerBuilder implements ComputerBuilder {
    private Computer computer;


public ConcreteComputerBuilder(){
    this.computer = new Computer();
}

public void buildCpu(){
    computer.setCpu("Brr brr v7");
}

@Override
public void buildRam(){
    computer.setRam("0GB");
}

@Override
public void buildStorage(){
    computer.setStorage("0GB");
}

@Override
public Computer getComputer(){
    return computer;
}
}
