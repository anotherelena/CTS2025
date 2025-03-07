//ascundem complexitatea prin stabilirea unei ordini clare
//referinta la builder apoi initializare computerdirector cu o instanta a builderului
public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.buildComputerType();
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
        builder.buildManufacturingType();
    }


}
