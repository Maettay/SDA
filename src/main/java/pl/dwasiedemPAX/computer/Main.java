package pl.dwasiedemPAX.computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer PC = new PC();
        Computer Laptop = new Laptop();
        Computer Mainframe = new Mainframe();

        changeDisc(computer);
        changeDisc(PC);
        changeDisc(Laptop);
        changeDisc(Mainframe);
        //changeDisc(new Computer());


    }

    public static void changeDisc(Computer change) {
        System.out.println("Change disc. Update");
        change.changeDisk();
        System.out.println("-----");
    }

   // public static void print ()



}
