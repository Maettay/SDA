package pl.dwasiedemPAX.constructor;

public class Pizza extends Dish {
    {
        System.out.println("Pizza - instance block");
    }
    static {
        System.out.println("Pizza - static block");
    }

    public Pizza(){
        this ("tiuna");
        System.out.println("Pizza()");
    }

    public Pizza(String additions){
        super ();  //somyślnie jest coś takiego
        System.out.println("Pizza with additions...");
    }

}
