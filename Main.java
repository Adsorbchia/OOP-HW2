package org.ex.seminar2.hw2;

import javax.sound.sampled.Line;
import javax.sound.sampled.Port;
import java.util.*;

/**
 * рассмотреть магазин ноутбуков, пользователь вводит критерий фильтрации (задача из последнего семинара по Java)
 */
public class Main {
    public static void main(String[] args) {
        MarketLaptops marketLaptops =new MarketLaptops();
        marketLaptops.addLaptop(new Lenovo("Черный",14.0,60,"FullHD",
                "CoreI3",8,"SSD","Lenovo",80.000));
        marketLaptops.addLaptop(new Samsung("Черный",17.0,150,"4К",
                "CoreI7",32,"SSD","Samsung",150.000));
        marketLaptops.addLaptop(new Honor("Черный",17.0,150,"4К",
                "CoreI7",32,"SSD","HONOR",150.000));
        marketLaptops.addLaptop(new Msi("Розовый",15.6,120,"4К",
                "CoreI7",16,"SSD","MSI",150.000));
        marketLaptops.addLaptop(new Lenovo("Черный",17.0,150,"2К",
                "CoreI5",16,"SSD","Lenovo",120.000));
        marketLaptops.addLaptop(new Msi("Белый",17.0,120,"2К",
                "CoreI7",32,"SSD","MSI",100.000));
        System.out.println("Выберите критерий фильтрации");
        System.out.println("1- Цвет");
        System.out.println("2- Размер дисплея");
        System.out.println("3- частота обнавления экрана");
        System.out.println("4- Разрешение экрана");
        System.out.println("5- Процессор");
        System.out.println("6- Объём оперативной памяти");
        System.out.println("7- Тип жесткого диска");
        System.out.println("8- Производитель");
        System.out.println("9- Цена");

        MarketLaptops infoList =new MarketLaptops<>();
        Map list1 = infoList.fillMapList();
        ArrayList arrayList= marketLaptops.getLaptop(list1);
        for (Object el:arrayList) {System.out.println(el);};
    }}
