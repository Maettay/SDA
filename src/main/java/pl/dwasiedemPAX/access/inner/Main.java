package pl.dwasiedemPAX.access.inner;

import pl.dwasiedemPAX.access.Person;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Mar","P",20);
        System.out.println(me);
        me.setAge(-50);

        System.out.println(me);
   //     me.secret = "My secret";
   //     me.secondSecret = "second secret";
        Child child = new Child();
   //     child.secondSecret = "hmmmmmm";
    }


}
