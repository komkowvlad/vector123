package com.company;

public class Main {

    public static void main(String[] args) {
	    Vector v = new Vector(2,4,3,5);
        Vector v1 = new Vector(3,5,4,6);
        v.equals(v1);
        v.length();
        System.out.println(v);
        System.out.println(v.equals(v1));
        System.out.println(v.length());
    }
}
