public class Main{
    public static void main(String[] args){

        ComputerBuilder gamingBuilder = new GamingComputerBuilder();

        ComputerDirector directorG = new ComputerDirector(gamingBuilder);

        directorG.constructComputer();

        Computer gamingComputer = gamingBuilder.getComputer();

        System.out.println("Gaming computer configuration:");
        System.out.println(gamingComputer);

        ComputerBuilder notebookBuilder = new NotebookComputerBuilder();

        ComputerDirector directorN = new ComputerDirector(notebookBuilder);

        directorN.constructComputer();

        Computer notebookComputer = notebookBuilder.getComputer();

        System.out.println("Notebook Computer Configuration: ");
        System.out.println(notebookComputer);
    }
}
