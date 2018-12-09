package pl.com.exception;


public class Person2 {

    private String name;
    private String surname;
    private int age;

    public Person2 (String name, String surname, int age) throws IllegalArgumentException {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException("Invalid name: " + name);

        } this.name = name;

        if (surname == null || surname.equals("")){
            throw new IllegalArgumentException("Invalid surname: " + surname);

        } this.surname = surname;
        if (age <= 0){
            throw new IllegalArgumentException("Wrong age");
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

