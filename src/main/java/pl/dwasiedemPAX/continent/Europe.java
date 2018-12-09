package pl.dwasiedemPAX.continent;

public class Europe {
    private String vvv;

    {
        System.out.println("Europe 1 - instance");
    }
    {
        System.out.println("Europe 2 - instance");
    }
    static {
        System.out.println("Europe 1 - static");
    }
    static {
        System.out.println("Europe 2 - static");
    }
    public Europe (){
        this ("vvv");
        System.out.println("Cons. Europe 1");
    }

    public Europe (String vvv){

        System.out.println("Cons.Europe 2");

    }



}
