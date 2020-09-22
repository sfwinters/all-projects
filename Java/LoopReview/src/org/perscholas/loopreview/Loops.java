package org.perscholas.loopreview;

public class Loops {
    //method called looping, returns nothing
    //take in a param that will dictate when the loop will stop
    //so if param = 200, for loop iterates from 0-200
    public static void looping(int param) {
        //"param" can be called anything. it will auto fill when the method is run (see line 18)
        //initial variable js => let i = 0;
        //conditional
        //action after loop js => i++;
        for (int i = 0; i <= param; i++) {
            System.out.println(i);
        }
    }

    public static void nested() {
        String s = "";
        for (int i=0; i<=5; i++){
            for (int j=0; j<10; j++) {

                s += "*";
            };
            System.out.println( s );
            s = "";
        };



    }

    public static void main(String[] args) {
        looping(200);
        nested();
    }

}
