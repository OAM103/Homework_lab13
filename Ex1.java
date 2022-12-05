package com.metanit;

public class Ex1 {
    public static void Ex1(String S){
        System.out.println(S);
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        Ex1(str);
        System.out.println(str.charAt(str.length()-1));
        if (str.endsWith("!!!"))System.out.println("Ends with !!!");
        if (str.startsWith("I like"))System.out.println("Starts with I like");
        if (str.contains("Java")){
            System.out.println("Contains Java");
            System.out.println(str.indexOf("Java"));
        }
        System.out.println(str.replace('a','o').replace('v','j') );
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.replace("Java", ""));
        int index = str.indexOf("J");
        System.out.println(str.substring(0, index));



    }
}
