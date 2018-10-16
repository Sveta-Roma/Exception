package org.itstep.qa.home.zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle1 {
    /*Решить задачу об определении площади треугольника по трем сторонам. Длины сторон вводить с клавиатуры.
    Проверку корректности ввода реализовать через обработку исключений. Проверку корректности длин сторон организовать
    через обработку исключений. (Выбросить собственное исключение).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            System.out.println("Введите длину первой стороны: ");
            a = scanner.nextInt();
            System.out.println("Введите длину второй стороны: ");
            b = scanner.nextInt();
            System.out.println("Введите длину третий стороны: ");
            c = scanner.nextInt();
        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }
        int p = (a+b+c)/2;
        int s = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника по трем сторонам: " + s);
    }

}
