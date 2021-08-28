package com.company;

import java.util.Collections;
import java.util.List;

public class Sorting  {

    public String getList (List<Elements> elementsList ){
        Collections.sort(elementsList);
        for (Elements name: elementsList) {
            System.out.print(name.getName() + " ");
        }
        System.out.println();
        return "Max value: " + elementsList.get(0).getName();
    }
    public String getArray (Elements[] arrayElements ){

        for(int i =0; i < arrayElements.length; i++){
            for(int j = i+1; j < arrayElements.length ; j++) {
                char order = arrayElements[i].getName().charAt(0);
                char order2 = arrayElements[i + 1].getName().charAt(0);
                Elements temp;
                if ((int)order < (int)order2) {
                    temp = arrayElements[i];
                    arrayElements[i] = arrayElements[i + 1];
                    arrayElements[i + 1] = temp;
                }
            }
            System.out.print(arrayElements[i].getName() + " ");
       }
        System.out.println();
        return "Max value: " + arrayElements[arrayElements.length-1].getName();
    }
}
