package pl.waw.mwi;

public class MatWil2018 {
    private String name;
    private String surname;
    private int age;

    //construktor1
    public MatWil2018(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }


    //construktor2
    public MatWil2018(String name, String surname) {
        this.name = name;
        this.surname = surname;
        setAge(-1);
    }

    public static void main(String[] args) {
        MatWil2018 me = new MatWil2018("Mat", "Wil", -2);
        MatWil2018 he = new MatWil2018("Jo", "Nesbo", 335);
        MatWil2018 it = new MatWil2018("Ro", "Ols", -3);


        MatWil2018 you = new MatWil2018("You", "Your");

        System.out.println("You: " + you);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        if (age < 0) {
//            this.age = 0; }
//        {else if (age > 200)
//            this.age = 200;          // instrukcja warunkowa
//        } else {            // bez warunku czyli zostaje to co wprowadzone


        if (age < 0) { //Halo halo, młodszy niż 0
            System.out.println("Halo halo, młodszy niż 0");
            this.age = 0;
            // return;
        }

        if (age > 200) {
            System.out.println("No nie źle, codziennie łyk nalewki?");
            this.age = 200;
            //return;}   // No nie źle, codziennie łyk nalewki?

            this.age = age;
        }


//        @Override
//        public String toString () {
//            return "MatWil2018{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", age=" + age +
//                    '}';
//        }

    }
}
