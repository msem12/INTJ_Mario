package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a character.");
        Scanner input = new Scanner(System.in);
        String chara = input.nextLine();
        System.out.println("Please enter a number.");
        while (true){
            int num = input.nextInt();
            if (num > 0 && num <= 10) {
                for (int i = 1; i <= num; i++) {
                    System.out.println(chara.repeat(i));
                }
                break;
            } else {
                System.out.println("Please enter a  number between 1 and 10.");
            }
        }
    }
}
