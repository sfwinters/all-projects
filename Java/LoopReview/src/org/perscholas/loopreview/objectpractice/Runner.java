package org.perscholas.loopreview.objectpractice;

import org.perscholas.loopreview.getandset.CarbonBasedLifeForm;

public class Runner {
    public static void main(String[] args) {
//        Sarah sarahObject = new Sarah();
//        System.out.println(sarahObject.name);
//        System.out.println(sarahObject.age);
//        System.out.println(sarahObject.heightCm);
        GoblinFace giblets = new GoblinFace(60, "death metal","NOOOOOOO");
        System.out.println(giblets.buttholeCircumference);

        Scrambles scrambles = new Scrambles("Scrambles Marie Tinykitten Sizemore", "tabby", "hot dogs", 1);
        System.out.println(scrambles.name);
        CarbonBasedLifeForm carbonLife = new CarbonBasedLifeForm();
        carbonLife.setKingdom("plant");
        System.out.println(carbonLife.getKingdom());
    }
}
