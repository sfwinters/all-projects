package org.perscholas.loopreview.getandset;

public class Trial {
    public static void main(String[] args) {
        //going to use Cat class with getters and setters
//        Cat catVarName = new Cat();
//        System.out.println(catVarName.age); // -> 0
//        catVarName.setAge(17);
//        System.out.println(catVarName.age); // -> 4
//        catVarName.setColor("flame point");
//        catVarName.setName("Henry");
//        catVarName.setWeight(8);
//        System.out.println(catVarName.getName());
//        System.out.println(catVarName.getColor());
//        System.out.println(catVarName.getWeight());

        CarbonBasedLifeForm plant = new CarbonBasedLifeForm();
        plant.setKingdom("Plant");
        System.out.println(plant.getKingdom());
        plant.setKingdom("Animal");
        System.out.println(plant.getKingdom());
    }
}
