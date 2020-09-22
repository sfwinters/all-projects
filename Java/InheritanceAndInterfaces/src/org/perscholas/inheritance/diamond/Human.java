package org.perscholas.inheritance.diamond;

import org.perscholas.inheritance.Animal;

public class Human extends Animal {
    //method overriding
    //we are going to override the move method to be more descriptive
//    @Override //these are called annotations in Java; annotations are metadata
//    public void move() {
//        System.out.println("I walk with 2 legs");
//    }
////    @Override //lets you know if you're correctly overriding the parent method
//    public void eat(String food){
//        System.out.println("I cook my food before I eat it");
//    }
    public void walk() {
        System.out.println("I am a human, so I generally walk with two legs");
    }
    public static void main(String[] args) {
        Human human = new Human();
    }
}
