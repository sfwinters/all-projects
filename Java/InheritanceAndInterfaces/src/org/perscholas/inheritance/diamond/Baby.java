package org.perscholas.inheritance.diamond;

public class Baby extends Human {
    public static void main(String[] args) {
    }
    @Override
    public void eat(String food){
        System.out.println("I can't eat solid food");
    }
    public void cry(){
        System.out.println("waaaaaaah");
    }
}
