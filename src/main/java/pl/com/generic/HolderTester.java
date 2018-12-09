package pl.com.generic;


import pl.com.equals_and_hashcode.Person;
import pl.dwasiedemPAX.animal.Cat;
import pl.dwasiedemPAX.animal.Dog;

public class HolderTester
{
    public static void main(String[] args) {

//        ObjectHolder holder = new ObjectHolder();
//        holder.setSecret(new Person("M", "P", 35));

        //processHolder (holder);

        GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setSecret("secret");
        System.out.println(stringHolder.getSecret());

//        Home<Zwierz> zwierzHome;
        Home<Dog> dogsHome;
        Home<Cat> catsHome;

        GenericHolder<Person> personHolder = new GenericHolder<>();
        personHolder.setSecret(new Person("a", "b", 12));
        System.out.println(personHolder.getSecret());



    } 

}
