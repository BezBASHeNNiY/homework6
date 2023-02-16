package ua.ithillel;

public class Main {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumNumbers(10, 5));
        checkNumber(-5);
        System.out.println(checkNumberBool(8));
        printString("Ukraine", 7);
        System.out.println(yearCheck(2000));
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 5;
        int b = 7;

        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value < 100) {
            System.out.println("Желтый");
        }
        else if (value >= 100) {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers(){
        int a = 12;
        int b = 15;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumNumbers(int a, int b){
        if (((a + b) < 20) && ((a + b) > 10)) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber(int a){
        if (a < 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumberBool(int a){
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String s, int a){
        for (int i = 0; i < a; i++){
            System.out.println(s);
        }
    }

    public static boolean yearCheck(int year){
        if ((year%100==0) && (year%400==0)) {
            return true;
        } else if ((year%4==0) && (year%100>0)){
            return true;
        } else if (year%100==0) {
            return false;
        } else {
            return false;
        }
    }
}