package pl.com.exception;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person (String name, String surname, int age) throws WrongParameter {
        if (name == null || name.equals("")){
            throw new WrongParameter("Invalid name: " + name);

        } this.name = name;

        if (surname == null || surname.equals("")){
            throw new WrongParameter("Invalid surname: " + surname);

        } this.surname = surname;
        if (age <= 0){
            throw new WrongParameter("Wrong age");
        }
        this.age = age;

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
