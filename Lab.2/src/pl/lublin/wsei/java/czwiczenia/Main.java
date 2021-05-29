package pl.lublin.wsei.java.czwiczenia;
import pl.lublin.wsei.java.czwiczenia.mylib.Account;
import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
         System.out.printf("%s%n",Account.translit("stanisŁARzaw maruS"));
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.translit("Тамара"));
        System.out.printf("%s%n", Account.translit("Калян"));
        System.out.printf("%s%n", Account.translit("Толік"));
        System.out.printf("%s%n", Account.translit("Саня"));
    }
}
