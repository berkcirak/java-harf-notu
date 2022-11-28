package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("alinan harf notunu giriniz: ");
        char grade = scan.next
        System.out.println("alinan harf notu: " + grade);

        switch(grade){
            case 'A':
                System.out.println("mukemmel");
                break;
            case 'B':
                System.out.println("cok iyi");
                break;
            case 'C':
                System.out.println("iyi");
                break;
            case 'D':
                System.out.println("orta");
                break;
            case 'F':
                System.out.println("kaldiniz");
                break;
            default:
                System.out.println("gecersiz not girdiniz...");
        }
    }






}
