package pl.lublin.wsei.java.czwiczenia;

import pl.lublin.wsei.java.czwiczenia.mylib.Account;
import pl.lublin.wsei.java.czwiczenia.mylib.StringFun;

import java.util.Scanner;
import java.util.Random;

public class IsPalindromeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Podaj tekst do sprawdzenia(0, jak Ci sie znudzi):");
            String tekst = scn.next();
            if(tekst.equals("0")) break;
            System.out.println("Takst:"+ tekst + " " +
                    (StringFun.isPalindrome(tekst) ?"" : "nie") + "jest palindromem");
        }while(true);
    }
}





