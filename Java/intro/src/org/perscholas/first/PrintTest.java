package org.perscholas.first;

public class PrintTest {
    //each datatype needs to be declared before naming a variable:

    byte aByte = -12; //8 bits; -128 to 127
    short aShort = 12312;
    int anInt = 2131234; //most common
    long aLong = 1234123412;
    double aDouble = 12.12; //double required to interact with decimals

    char someChar = 'a'; //single quotes can store only a single character (any ASCII character)
    String someString = "asdkfajdfsf"; //double quotes required for string (even single character string)
    //String is a class (so has to be capitalized); char is a primitive datatype so has to be lowercase

    boolean someBoolean = true;
    boolean someOtherBoolean = false;

    public static void main(String[] args) {
        int age = 40;
        if(age >= 21) {
            System.out.println("You are allowed in");
        } else if (age > 17) {
            System.out.println("You can't come in");
        } else {
            System.out.println("I'm gonna tell your mom");
        }
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                case 7:
                    System.out.println("It is the weekend");
        }
            int i = 0;
            while(i <= 20) { //i <=20 is the stopping condition
                System.out.println("While loop. i is equal to " + i); //this will produce infinite loop without a stopping condition
                i++; //increments i by 1 each time the loop runs
            }
    }
}
