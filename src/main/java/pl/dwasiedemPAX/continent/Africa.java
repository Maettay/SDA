package pl.dwasiedemPAX.continent;

public class Africa extends Europe {
    private String name;

    {
        System.out.println("AfricA 1 - instance");
    }
    {
        System.out.println("AfricA 2 - instance");
    }
    static {
        System.out.println("AfricA 1 - static");
    }
    static {
        System.out.println("AfricA 2 - static");
    }
    public Africa (String name){

        System.out.println("Const. AfricA first");
    }
    public Africa (){
        this ("coś");
        System.out.println("Const. AfricA second");
    }


}
