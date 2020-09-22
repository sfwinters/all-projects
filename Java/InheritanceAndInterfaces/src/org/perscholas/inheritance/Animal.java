package org.perscholas.inheritance;

public class Animal {
    //turn this Animal class to an interface
    public void eat(String food){
        System.out.println("I am eating this: " + food);
    }
    public void sleep(boolean bool) {
        if (bool)
            System.out.println("snore"); //curly braces only needed if there is more than one action
        else
            System.out.println("I am wide awake");
    }
    public void move(){
        System.out.println("I am moving around.");
    }
}
