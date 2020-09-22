package org.perscholas.loopreview.getandset;

public class Cat {
    public String name;
    public String color;
    public int weight;
    public int age;

    //getters and setters
    //need a method that takes a param
    //set param equal to name var within this class
    public void setName(String nameParam){
        this.name = nameParam;
    }

    public String getName(){
        return name;
    }

    public void setColor(String colorParam) {
        this.color = colorParam;
    }

    public String getColor(){
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
