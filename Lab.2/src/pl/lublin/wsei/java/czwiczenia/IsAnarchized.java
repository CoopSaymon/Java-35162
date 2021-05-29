package pl.lublin.wsei.java.czwiczenia;

import pl.lublin.wsei.java.czwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsAnarchized  {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        do{
            System.out.println("Enter text for the test (spaces should " +
                    "be replaced with '_'), (0 to exit):");
            String text = scn.nextLine();
            if(text.equals("0")) break;
            System.out.println("Anarchized text: "+ StringFun.anarchize(text));
        } while (true);
    }
}

