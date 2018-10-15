package org.itstep.qa.lesson.entity;

import org.itstep.qa.lesson.exception.ColorEyesException;
import org.itstep.qa.lesson.exception.CountEyesException;

public class Cat {
    private int countEyes;
    private String colorEyes;

    public Cat (int countEyes, String colorEyes){
        this.countEyes = countEyes;
        this.colorEyes = colorEyes;
    }

    public void printCountEyes() { // сами  создали ошибку javaсковая ей не обязательна throws
        if(countEyes != 2){
            throw new IndexOutOfBoundsException();
        }
        System.out.println("Количество глаз у котика = " + countEyes);
    }
    public void printColorEyes() throws ColorEyesException, CountEyesException { // сами  свою создали ошибку// если ошибка самописная обязательно пишем throws и имя ошибки
        if(!colorEyes.equals("Green")){
            throw new ColorEyesException();
        }
        if(countEyes != 2){
            throw new CountEyesException();
        }
        System.out.println("Цвет глаз у котика = " + colorEyes);
    }
}
