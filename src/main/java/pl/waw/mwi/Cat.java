package pl.waw.mwi;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Cat cat = new Cat();

    }
//constructor
    public Cat(String name) {
        this.name = name;
    }

    //c2

    public Cat() {
        this.name = "Leon";
    }
}

