package org.itstep.qa.home.zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    /*Организовать ввод с клавиатуры массива элементов заданного типа (целых чисел). Проверку корректности ввода
    реализовать через обработку исключений. (Можно отслеживать InputMismatchException). В случае если пользователь
    ввел некорректное значение, заполнять соответствующую ячейку массива значением по умолчанию
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел");
        int [] array = new int[3];
        for(int i = 0; i < array.length; i++){
            try{
                array [i] = scanner.nextInt();
                scanner.nextLine();
                System.out.println(array[i]);
            }catch (InputMismatchException ex){
                ex.printStackTrace();
            }
            System.out.println("Вы вели: " + array[i]);
        }
    }
}
