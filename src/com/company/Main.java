package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static List <Elements> elementsList = new LinkedList<>();
    private static Elements[] elementsArray;
    public static void main(String[] args) {
	Elements elements1 = new Elements("Lev");
	Elements elements = new Elements("Oleg");
	Elements elements2 = new Elements("Bob");

        elementsList.add(elements);
        elementsList.add(elements1);
        elementsList.add(elements2);

        elementsArray = new Elements[]{
                elements,
                elements1,
                elements2};

        System.out.println(new Sorting().getList(elementsList));
        System.out.println(new Sorting().getArray(elementsArray));
    }
}
