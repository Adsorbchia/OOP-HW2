package org.ex.seminar2.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Filter {
    void addLaptop(Laptop item);
    Map fillMapList();

    ArrayList getLaptop(Map infoList);
}
