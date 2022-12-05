package com.metanit.Ex4;

public class Shirt {
    private String number, name, color, size;

    public Shirt(String stringToParse){
        String[] s = stringToParse.split(",");
        number = s[0];
        name = s[1];
        color = s[2];
        size = s[3];
    }

    public String toString() {
        return "Shirt: " + "number = " + number + ", name = " + name + ", color = " + color + ", size = " + size;
    }


}
