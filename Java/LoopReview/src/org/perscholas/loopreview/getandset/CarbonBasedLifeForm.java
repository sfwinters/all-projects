package org.perscholas.loopreview.getandset;

public class CarbonBasedLifeForm {
    private String kingdom;
    private String planet;
    private int height;
    private String color;
    private boolean multicellular;

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }

    public void setMulticellular(boolean multicellular) {
        this.multicellular = multicellular;
    }
}

