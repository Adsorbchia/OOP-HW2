package org.ex.seminar2.hw2;

import java.util.ArrayList;
import java.util.List;

public abstract class Laptop {
    private String color;
    private Double screenDiagonal;
    private Integer screenRefreshRate;
    private String screenResolution;
    private String processor;
    private Integer ram;
    private String driveType;
    private String manufacturer;
    private Double price;

    public Laptop(String color, double screenDiagonal, int screenRefreshRate, String screenResolution, String processor, int ram, String driveType, String manufacturer, double price) {
        this.color = color;
        this.screenDiagonal = screenDiagonal;
        this.screenRefreshRate = screenRefreshRate;
        this.screenResolution = screenResolution;
        this.processor = processor;
        this.ram = ram;
        this.driveType = driveType;
        this.manufacturer = manufacturer;
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(Double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public Integer getScreenRefreshRate() {
        return screenRefreshRate;
    }

    public void setScreenRefreshRate(Integer screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    @Override
    public String toString() {;
    return"цвет - "+" "+color+ ","+"Размер дисплея  - "+  screenDiagonal +" , "
                + "частота обновления экрана - "+screenRefreshRate +" , "+"Разрешение экрана - "+ screenResolution+" , "+"Процессор - "+ processor+
                " , "+"Объём оперативной памяти - "+ram+ " , "+ "Тип жесткого диска - " +driveType+" , "+
                "Производитель - "+  manufacturer+" , "+ "цена - "+ price;
    }

}
