package com.company;

public class Elements implements Comparable<Elements> {
   private String name;

    public Elements(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Elements o) {
        return this.name.compareTo(o.getName() );
    }
}
