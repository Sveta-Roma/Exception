package org.itstep.qa.home.zadania;

import org.itstep.qa.home.ecxeption.SquareTriangleException;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void printSideTriangle(){
        if (sideA < 0 || sideB < 0 || sideC < 0){
           throw new IndexOutOfBoundsException();
        }
        System.out.println("Первая сторона треугольника равна " + sideA);
        System.out.println("Вторая сторона треугольника равна " + sideB);
        System.out.println("Третья сторона треугольника равна " + sideC);
    }

    public int halfMeterTriangle(){
        int p = (sideA + sideB + sideC)/2;
        return p;
    }

    public void squareTriangle()throws SquareTriangleException {
        int p = (sideA + sideB + sideC)/2;
        int s = (int) Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        System.out.println("Площадь треугольника " + s);
        if (s < 0){
            throw new SquareTriangleException();
        }
    }
}
