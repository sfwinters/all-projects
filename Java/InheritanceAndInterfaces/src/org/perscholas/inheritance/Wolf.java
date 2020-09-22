package org.perscholas.inheritance;

public class Wolf extends Dog {
    public static void main(String[] args) {
        Wolf newWolf = new Wolf();
        newWolf.howl();
        newWolf.growl();
        newWolf.eat("deer");
    }
    public void howl() {
        System.out.println("aroooooooo");
    }
    public void hunt() {
        System.out.println("I'ma getcha");
    }
    public void packs() {
        System.out.println("I am with my group");
    }
}
