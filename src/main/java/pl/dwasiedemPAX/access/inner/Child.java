package pl.dwasiedemPAX.access.inner;

import pl.dwasiedemPAX.access.Person;

import java.sql.SQLOutput;

public class Child extends Person {

    public void sayHello(){
 //      System.out.println("My secret: " + secret);
        System.out.println("My second secret: " + secondSecret);
    }

}
