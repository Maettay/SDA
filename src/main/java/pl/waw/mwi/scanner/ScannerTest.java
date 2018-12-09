package pl.waw.mwi.scanner;

import java.util.Scanner;    //gdy zamiast scanner damy * da wszystkie z util, a nie tylko scanner
import java.lang.*;


public class ScannerTest {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter the numbers....");
        int intValue = inputReader.nextInt();
        int secondValue = inputReader.nextInt();
        int thirdValue = inputReader.nextInt();

      //  System.out.println("I've got int value: " + intValue + " and " + secondValue + " and " + thirdValue);

        System.out.println(intValue * secondValue * thirdValue);

for (; inputReader.hasNext();){
    if (inputReader.hasNextInt()) {
        System.out.println(inputReader.next());
    }else{
        inputReader.next();
    }
}


    }


}//
