package pl.matwil.learning_java;


import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int a = inputReader.nextInt();
        int b = inputReader.nextInt();
        int c = inputReader.nextInt();
        int d = inputReader.nextInt();

        int max = findMax(a, b, c);
        System.out.println("Found max: " + max);

        // int min = findMin(a:1, b:5, c:6, d:-1);
        int min = findMin(a, b, c, d);
        System.out.println("Found min: " + min);

    }//psvm

    public static int findMax (int d, int e, int f){
        int max = d;
        if (e > max) {
            max = e;
        }
        if (f >max){
            max = f;
        }


        return max;

    }
    // MIN
    public static int findMin (int a, int b, int c, int d){
        int min = a;

        if (b < min){
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        return min;

    }




}// fin

