package org.itstep.qa.lesson.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int result = -1;
        try {
            result = scanner.nextInt();
            System.out.println("Код который идет после ввода");
            int [] array = new int[3];
            array[3] = result;
        }catch (InputMismatchException ex){
            System.out.println("Сработала секция catch для InputMismatchException");
            ex.printStackTrace();// нужно всегда выводить ошибку в каждом catch
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Сработала секция catch для ArrayIndexOutOfBoundsException");
            ex.printStackTrace();
        } finally {
            System.out.println("Сработала секция finally");//закрытие браузера, закрытие БД и т.д сюда выносится то что обязательно должно выполнится
        }
        System.out.println("Вы вели: " + result);
        // тут могут быть куча строчек кода
    }
}
