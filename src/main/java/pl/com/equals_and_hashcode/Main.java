package pl.com.equals_and_hashcode;

public class Main {

    public static void main(String[] args) {
        Person me = new Person ("Mariusz","P.",35);
        Person maniek = me;
        System.out.println("me.equals(maniek): " + me.equals(maniek));

        System.out.println("me == maniek? :" + (me == maniek));

        maniek = new Person ("Mariusz","P.",35);
        System.out.println("and now, me ==maniek?:" + (me == maniek));

        System.out.println("me.equals(maniek): " + me.equals(maniek));





    }

}
