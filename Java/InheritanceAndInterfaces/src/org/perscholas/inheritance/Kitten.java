package org.perscholas.inheritance;

public class Kitten extends Feline {
    public static void main(String[] args) {
        Kitten scrambles = new Kitten(){
          public void watchBirds() {
              System.out.println("Birds are very exciting");
          }
        };
        scrambles.eat("hot dogs");
        scrambles.pounce();
    }
}
