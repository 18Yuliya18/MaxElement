package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final List <Element> elementsList = new LinkedList<>();
    private static Element[] elementsArray;
    public static void main(String[] args) {
        Element number1 = new Element("A");
        Element number2 = new Element("B");
        Element number3 = new Element("C");

        Element number4 = new Element(1);
        Element number5 = new Element(2);
        Element number6 = new Element(3);

        elementsList.add(number1);
        elementsList.add(number2);
        elementsList.add(number3);

        elementsArray = new Element[]{
                number4,
                number5,
                number6};
        System.out.println(new Sorting().getList(elementsList).getKey());
        System.out.println(new Sorting().getArray(elementsArray).getKey());

    }
}
