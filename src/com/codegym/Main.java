package com.codegym;

import java.util.Scanner;

public class Main {

    static String aDigit(int number){    // số có 1 chữ số
	
        switch (number){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
        }
        return "";
    }

    static String numberOfUnits(int number){  // số đơn vị
        switch (number){
            case 0: return "";
            case 1: return "-one";
            case 2: return "-two";
            case 3: return "-three";
            case 4: return "-four";
            case 5: return "-five";
            case 6: return "-six";
            case 7: return "-seven";
            case 8: return "-eight";
            case 9: return "-nine";
        }
        return "";
    }

    static String tenToNineteen(int number){   // 10 đến 19
        switch (number){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
        }
        return "";
    }

    static String twoDigits(int number){        // số có 2 chữ số
        int hangchuc=(int)number/10, hangdonvi=number%10;
        switch (hangchuc){
            case 2: return "twenty"+numberOfUnits(hangdonvi);
            case 3: return "thirty"+numberOfUnits(hangdonvi);
            case 4: return "fourty"+numberOfUnits(hangdonvi);
            case 5: return "fifty"+numberOfUnits(hangdonvi);
            case 6: return "sixty"+numberOfUnits(hangdonvi);
            case 7: return "seventy"+numberOfUnits(hangdonvi);
            case 8: return "eighty"+numberOfUnits(hangdonvi);
            case 9: return "ninety"+numberOfUnits(hangdonvi);
        }
        return "";
    }

    static String threeDigits(int number){
        int hangtram = (int)number/100, phansau=number%100;
        return aDigit(hangtram)+" hundred "+twoDigits(phansau);
    }

    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number: ");
        Scanner sc  = new Scanner(System.in);
        number = sc.nextInt();
        if(number<10) System.out.println(aDigit(number));
        else if(number<20) System.out.println(tenToNineteen(number));
        else if(number<100) System.out.println(twoDigits(number));
        else System.out.println(threeDigits(number));
    }
}
