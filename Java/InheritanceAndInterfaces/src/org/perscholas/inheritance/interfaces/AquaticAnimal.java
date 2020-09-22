package org.perscholas.inheritance.interfaces;

public class AquaticAnimal implements Animal{

    @Override
    public String move() {
        System.out.println("swim swim");
    }

    @Override
    public String walk() {
        System.out.println("Sometimes I can walk on land");
    }

    @Override
    public String eat() {
        System.out.println("I eat smaller animals");
    }

    @Override
    public String breathe() {
        System.out.println("glub glub");
    }

    @Override
    public String naturalHabitat() {
        System.out.println("under the sea");
    }
}
