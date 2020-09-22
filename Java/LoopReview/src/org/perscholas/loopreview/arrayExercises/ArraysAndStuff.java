package org.perscholas.loopreview.arrayExercises;

public class ArraysAndStuff {
    private String name = "Frank";
        /*
        * js => const r = [1, 2, 3];
        * int[]arr = new int[] {}
        * datatype[] arr = new datatype[] {datatype, datatype, datatype}
         */

        public static void program() {
            int[] arr = new int[]{1, 2, 3};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        };

        public static void rollCall() {
            String[] arrOfStrings = new String[] {"PersonA", "PersonB", "PersonC"};
            for (int i = 0; i < arrOfStrings.length; i++) {
                System.out.println(arrOfStrings[i]);
            }
        }

        public static void average() {
            int[]avgArr = new int[] {20, 30, 25, 35, -16, 60, -100};
            int sum = 0;
            for (int i = 0; i < avgArr.length; i++) {
                sum += avgArr[i];
            }
            System.out.println(sum/ avgArr.length);
        }
    public static void main(String[] args) {
            program();
        rollCall();
        average();
    }
}
