package org.itstep.qa.home.zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел");
        int [] array = new int[5];
        for(int i = 0; i < array.length; i++){
            try{
            array [i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println(array[i]);
        }catch (InputMismatchException ex){
                ex.printStackTrace();
            }
        }
    }
}
