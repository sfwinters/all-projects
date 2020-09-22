package org.perscholas.inheritance.diamond;

//public class Grandchild implements Interface1, Interface2
//cannot extend multiple classes
public class Grandchild extends DrHouse {
    public static void main(String[] args) {
        Grandchild grandchild = new Grandchild();
        grandchild.walk(); //"I walk with a cane"
    }

}
