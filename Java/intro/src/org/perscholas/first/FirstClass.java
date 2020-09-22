package org.perscholas.first;

public class FirstClass {
    private int age = 40; //private means it is only available to the parent Class
    public static void main(String[] args) { //void is a return class; means return nothing
        sayYourName();
        System.out.println();
    }

    /*
        * private is called the access modifier
        * static is a specific keyword that is a little complicated and better left to a resource
        * String is the return type. We can only have one data type as the return type.
     */

    private static String sayYourName() { //this will return a String
        System.out.println("Sarah");
        return "Sarah";
    }
}
