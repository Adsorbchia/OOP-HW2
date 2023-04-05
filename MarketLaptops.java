package org.ex.seminar2.hw2;

import java.util.*;

public class MarketLaptops<infoList> implements Filter {
    private List<Laptop> list;
    private Map infoList;


    public MarketLaptops() {
        list = new ArrayList();
        infoList=new HashMap<>();}

    public void addLaptop(Laptop item) {
        list.add(item);}

    public Map  fillMapList(){
        String filterKey=" ";
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        switch (num1)
        {
            case 1:
                filterKey="color";
                System.out.println("Введите цвет");
                String color = sc.next();
                infoList.put(filterKey,color);
                break;
            case 2:
                filterKey="screenDiagonal";
                System.out.println("Введите размер дислея");
                Double screenDiagonal = sc.nextDouble();
                infoList.put(filterKey,screenDiagonal);
                break;
            case 3:
                filterKey="screenRefreshRate";
                System.out.println("Введите частоту обнавления экрана");
                Integer screenRefreshRate =sc.nextInt();
                infoList.put(filterKey,screenRefreshRate);
                break;
            case 4:
                filterKey="screenResolution";
                System.out.println("Введите Разрешение экрана");
                String screenResolution= sc.next();
                infoList.put(filterKey,screenResolution);
                break;
            case 5:
                filterKey="processor";
                System.out.println("Введите тип процессора");
                String processor = sc.next();
                infoList.put(filterKey,processor);
                break;
            case 6:
                filterKey="ram";
                System.out.println("Введите Объём оперативной памяти");
                Integer ram=sc.nextInt();
                infoList.put(filterKey,ram);
            case 7:
                filterKey="driveType";
                System.out.println("Введите тип жесткого диска");
                String driveType = sc.next();
                infoList.put(filterKey,driveType);
                break;
            case 8:
                filterKey = "manufacturer";
                System.out.println("Введите Производителя");
                String manufacturer = sc.next();
                infoList.put(filterKey,manufacturer);
                break;
            case 9:
                filterKey = " price";
                System.out.println("Введите цену");
                Double price = sc.nextDouble();
                infoList.put(filterKey,price);
                break;
        }
        return infoList;
    }

    public ArrayList getLaptop (Map infoList) {
        ArrayList<Laptop> resulList = new ArrayList<>();
            for (Laptop el1:list) {
                boolean allFiltersMatch=true;
                for (Object filterKey:infoList.keySet()) {
                    Object filterValue =infoList.get(filterKey);
                    if (filterKey.equals("color")) {
                        if (!el1.getColor().equals(filterValue)) {
                            allFiltersMatch = false;}
                    }
                    if (filterKey.equals("screenDiagonal")){
                        if (el1.getScreenDiagonal()!= (double) filterValue){
                            allFiltersMatch=false;}
                    }
                    if (filterKey.equals("screenRefreshRate")){
                        if (el1.getScreenRefreshRate() != (int) filterValue){
                            allFiltersMatch=false;
                        }
                    }
                    if (filterKey.equals("screenResolution")){
                        if ( !el1.getScreenResolution().equals(filterValue)){
                            allFiltersMatch=false;
                        }
                    }
                    if (filterKey.equals("processor")){
                        if(!el1.getProcessor().equals(filterValue)){
                            allFiltersMatch=false;
                        }
                    }
                    if (filterKey.equals("ram")){
                        if(el1.getRam()!=(int) filterValue){
                            allFiltersMatch=false;
                        }
                    }
                    if (filterKey.equals("driveType")){
                        if(!el1.getDriveType().equals(filterValue)){
                            allFiltersMatch=false;
                        }
                    }
                    if(filterKey.equals("manufacturer")){
                        if(!el1.getManufacturer().equals(filterValue)){
                            allFiltersMatch=false;
                        }
                    }
                    if (filterKey.equals("price")){
                        if(el1.getPrice()!=(Double)filterValue){
                            allFiltersMatch=false;
                        }
                    }
                    if (!allFiltersMatch){
                        break;
                    }
                    if((allFiltersMatch)){
                        resulList.add(el1);
                    }}}
            return resulList;}}






