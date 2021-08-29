package com.company;

import java.util.List;

public class Sorting  {

    public Element getList (List<Element> elementsList ){
        Element max = elementsList.get(0);

        for (Element i: elementsList) {
            if(i.compareTo(max) == 1)
                max = i;
        }
        return max;
    }
    public Element getArray (Element[] arrayElements ) {
        Element max = arrayElements[0];

        for (Element i: arrayElements) {
            if(i.compareTo(max) == 1)
                max = i;
        }
        return max;
    }
}
