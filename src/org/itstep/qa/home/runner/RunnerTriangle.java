package org.itstep.qa.home.runner;

import org.itstep.qa.home.ecxeption.SquareTriangleException;
import org.itstep.qa.home.zadania.Triangle;

public class RunnerTriangle {
    public static void main(String[] args) throws SquareTriangleException {
        System.out.println("Первый треугольник");
        Triangle triangleOne = new Triangle(1,2,3);
        triangleOne.printSideTriangle();

        System.out.println("Полупериметр первого треугольника " + triangleOne.halfMeterTriangle());
        triangleOne.squareTriangle();

        System.out.println("Второй треугольник");
        try {
            Triangle triangleTwo = new Triangle(-20,-20,-20);
            triangleTwo.printSideTriangle();
            triangleTwo.squareTriangle();
        }catch (SquareTriangleException ex){
            ex.printStackTrace();
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }


    }
}
