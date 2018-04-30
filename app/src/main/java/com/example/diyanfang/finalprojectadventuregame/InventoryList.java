package com.example.diyanfang.finalprojectadventuregame;

/**
 * Created by diyanfang on 4/30/18.
 */

public class InventoryList {

    String name;
    int numberOfItems;

    public InventoryList(String name, int numberOfItems) {
        this.name = name;
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public String toString() {
        return "InventoryList{" +
                "name='" + name + '\'' +
                ", numberOfItems=" + numberOfItems +
                '}';
    }

}
