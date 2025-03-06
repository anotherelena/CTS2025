/*Builder design: cand avem un obiect pe care vrem sa il customizam in multe feluri diferite
 * Componente: produsul (clasa) pe care vrem sa o modificam in feluri diferite. atributele (pe care le construieste builderul)
 * Builderul: interfata/clasa abstracta care declara pasii necesarii constructiei diferitelor tipuri de atribute
 * ConcreteBuilder: implementarea metodelor de constructie
 * Director: high level interface that manages all the types of builders???
 * Client: codul care initiaza constructia
 * 
 * Exemplu de problema: You are tasked with implementing a system for building 
 * custom computers. Each computer can have different configurations based on user 
 * preferences. The goal is to provide flexibility in creating computers with varying 
 * CPUs, RAM, and storage options. 
 */

 public class Main{
    public static void main(String[] args) {
        ComputerBuilder builder = new ConcreteComputerBuilder();

        Director director = new Director(builder);
        director.constructBlankComputer();
    
        Computer computer = builder.getComputer();
        System.out.println(computer);
    
    }

 }
