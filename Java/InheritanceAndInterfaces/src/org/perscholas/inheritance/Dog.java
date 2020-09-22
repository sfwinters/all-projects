package org.perscholas.inheritance;

public class Dog extends Animal {
    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.sleep(true);
    }
    public void growl(){
        System.out.println("I growl when I'm angry");
    }
    public void bark(){
        System.out.println("I bark at the mailman");
    }
}
