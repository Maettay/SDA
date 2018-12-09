package pl.waw.mwi.string_tests;

public class StringTest {

    //TODO: show references
    public static void main(String[] args) {
        String name = "Mariusz";
        String anotherMariusz = "Mariusz";
        String theSame = name;
        String secondName = new String("Mat");
        String surname = "Wilczynski";

        System.out.println("My name: " + name);
        System.out.println("My surname: " + surname);
        System.out.println("Name, number of letters: " + name.length());
        System.out.println("Surname, number of letters: " + surname.length());

        System.out.println("Chat at index 2: " + name.charAt(2));
      // indexes in java counts from 0 to length -1
        //   System.out.println("Chat at index 3: " + name.charAt(3));
        System.out.println("Chat at index 1: " + name.charAt(1));
        System.out.println("///////////////////////////////");
        // System.out.println("My new surname: " + surname.substring(1)); // ucieło nazwisko, od 2 litery wyświetla
        System.out.println("My new surname: " + surname.substring(2,5));
        System.out.println("My brand new surname: " + surname.substring(2,10));   // synonim tego z length czyli do konca

        System.out.println("Replace: " + theSame.replace('i','r'));

        System.out.println("My surname:..." + surname);
        System.out.println("theSame:..." + theSame);

        String hello = "hello";
        System.out.println(hello + " java");
        System.out.println(hello.concat(" java"));
        hello = hello + "java";
        System.out.println(hello);

        System.out.println(5 + 6);
        System.out.println("5 + 6: " +(5+6));
        System.out.println(5 + 6 + " - 5 + 6");
        System.out.println("5 + 6: " + 5+6);
        System.out.println("J" + 7);
        System.out.println('J' + 7);
        System.out.println('J');
        System.out.println((int)'J');   //podglądamy kod J ile jets przypisane. Jaka będzie wartość J



    }

}
