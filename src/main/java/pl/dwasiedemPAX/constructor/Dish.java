package pl.dwasiedemPAX.constructor;


public class Dish {
        private String kind;

    {
        System.out.println("Dish - first init block");
    }

    static {
        System.out.println("Dish - static First initialization");
    }

    public Dish(){   // nazwa konstruktora taka sama jak klasy. Nazwa zbie zna z nazwa klasy
       // miejsce wywoływania blokow niestatycznych     2.  najpierw static potem instancyjne i konstruktor
       this("pasta");
       // dokładnie tu sie wykonują
        System.out.println("Dish()");
    }

    {
        System.out.println("Dish - second init block");
    }
    //overloading wielokrotnie wykorzystanie tak samej nazwy z różnymi parametrami
    public Dish (String kind){
        System.out.println("Dish() " + kind);
        this.kind = kind;
    }

    static{
        System.out.println("Dish - static Dish class inintializator");

    }

}
