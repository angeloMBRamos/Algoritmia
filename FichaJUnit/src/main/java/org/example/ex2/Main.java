package org.example.ex2;

import org.example.ex1.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a;

        System.out.print("Insira uma palavra: ");
        a= input.next();

        if(StringUtils.isPalindrome(a)){
            System.out.println("A palavra [" + a + "]" + " é palindrome");
        }else {
            System.out.println("A palavra [" + a + "]" + " não é palindrome");
        }

    }
}
