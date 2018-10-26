package org.itstep.qa.home.runner;

import com.sun.xml.internal.messaging.saaj.soap.impl.TreeException;
import org.itstep.qa.home.ecxeption.SquareTriangleException;
import org.itstep.qa.home.ecxeption.TrException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerTr {
    /*Решить задачу об определении площади треугольника по трем сторонам. Длины сторон вводить с клавиатуры.
Проверку корректности ввода реализовать через обработку исключений. Проверку корректности длин сторон организовать
через обработку исключений. (Выбросить собственное исключение).
 */
    public static void main(String[] args) {
        System.out.println("Введиде первую сторону");
        int sideA = inputWithControl();
        System.out.println("Введиде вторую сторону");
        int sideB = inputWithControl();
        System.out.println("Введиде третьюю сторону");
        int sideC = inputWithControl();
        double result = square(sideA, sideB, sideC);
        if(result > 0){
            System.out.println("Площать треугольника равна " + result);
        }
    }


    private static int inputWithControl(){//контроль ввода проверка на буквы
        int sideA;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                sideA = scanner.nextInt();
                break;
            }catch (InputMismatchException ex){
                scanner.nextLine();
                System.out.println("Ввведенное значение некорректно");
            }
        }
            return sideA;
        }


        private static double square(int sideA, int sideB, int sideC){// собственная ошибка
        double square = 0;
        try {
            if ((sideA+sideB<=sideC)|| (sideA+sideC<=sideB)|| (sideB+sideC<=sideA)){
                throw new TrException();
            }
            double p = (sideA+sideB+sideC)/2.0;
            square = Math.sqrt((p-sideA)*(p-sideB)*(p-sideC)*p);
        }catch (TrException ex){
            System.out.println("Треугольник с такими стронами существовать" + " не может");
            System.out.println("Работа программы прекращена. Попробуйте еще раз");
        }
        return square;
    }
}
