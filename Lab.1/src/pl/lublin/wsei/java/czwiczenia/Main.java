package pl.lublin.wsei.java.czwiczenia;

import pl.lublin.wsei.java.czwiczenia.mylib.Account;

import java.util.Scanner;
import java.util.Random;


//jednolinkowe

/*
wielolinijkowy
 */





/**
 * @param
 * @return
 */
//public class Main {
//
//    public static void main(String[] args) {
//	System.out.print("Hello Java world");
//   }
//}




//public class Main {
//
//    public static void main(String[] args) {
//        System.out.print("Ala\n");
//        System.out.print("ma\n");
//        System.out.print("kota\n");
//}
//    }



//public class Main {
//
//    public static void main(String[] args) {
//        int a = 3;
//        double b = 4.21;
//        String s =  "Tekst";
//
//        System.out.printf("a=%d , b=%.2f, s= %20s %n", a,b,s);
//
//    }
//}



//public class Main {
//
//    public static void main(String[] args) {
//        System.out.printf("Nazywalismy\tto\t„witaminą\tB3");
//
//    }
//}



//public class Main {
//
//    public static void main(String[] args) {
//        System.out.printf("alfa\tsin(alfa)\n");
//        for (int i = 0; i < 370; i+=10)
//            System.out.printf("%d\t%f\t\n,", i, Math.sin(i/360.0*2*Math.PI));
//    }
//}
//

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//        System.out.print("Podaj pierwszą liczbe:");
//        num1 = input.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//        num2 = input.nextInt();
//        System.out.printf("Wynik dodawania %d + %d = %d%n", num1,num2,num1+num2);
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num1= 0, num2 = 0;
//        do {
//            System.out.print("Podaj liczbe ktorej mam dodac:");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if ((num1 == 0)||(num2 == 0)) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);
//
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        int num1=0, num2=0;
//        Scanner input = new Scanner(System.in);
//        do {
//            System.out.print("Podaj liczbę, które mam dodać: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if ((num1 == 0)||(num2==0)) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1+num2);
//
//        }while (true);
//
//
//    }
//}


//public class Main {
//    public static void main(String[] args) { numer();    }
//
//    public static String toHex(int val) {
//        var res = Integer.toHexString(val);
//        return res;
//    }
//
//    public static String toBinary(int val) {
//        var res = Integer.toBinaryString(val);
//        return res;
//    }
//
//    private static String leftPad(String str, char s, int val)
//    {
//        String res = str;
//        for (int i = 0; i < val; i++)
//        { res = s + res; }
//        return res;
//    }
//    public static Integer numer() {
//        Scanner input = new Scanner(System.in);
//        int num;
//        System.out.print("Podaj liczbe:");
//        num = input.nextInt();
//        var toBinary = toBinary(num);
//        var toHex = toHex(num);
//        System.out.println("DEC = " + num + ". BIN = " + toBinary + " .HEX = 0x" + toHex);
//        System.out.println(leftPad(toBinary, '0', 4));
//        System.out.println(leftPad(toHex, '0', 4));
//        return num;
//    }
//}


//public class Main {
//
//    private static String leftPad(String aText, char aChar, int aWidth) {
//    String res = aText;
//    for (int i = 0; i < aWidth - aText.length(); i++)
//    res = aChar + res;
//    return res;
//
//    int[] liczby = new int[30];
//     Random rnd = new Random();
//
//    for (int i = 0; i < 30; i++)
//        liczby[i] = rnd.nextInt();
//
//    int mx = Integer.MIN_VALUE;
//    int mn = Integer.MAX_VALUE;
//    long avg = 0;
//    for (int 1:liczby)
//    {
//    System.out.println(1);
//    if (1 < mn) mn = 1;
//    if (1 > mx) mx = 1;
//    avg += 1;
//    }
//    System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float) avg / liczby.length);
//}
//
//}

class Main{
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Piotr Gołobek");
        System.out.println(acc.getName());
    }
}


//class Main{
//    public static void main(String[] args) {
//
//        Account acc = new Account();
//        acc.setName("piotr Gołabek");
//        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
//         System.out.printf("%s%n",Account.translit("stanisŁARzaw maruS"));
//        System.out.println(acc.getName());
//        System.out.printf("%s%n", Account.translit("Валера"));
//        System.out.printf("%s%n", Account.translit("Анфиса"));
//        System.out.printf("%s%n", Account.translit("ЯрикБалабол"));
//        System.out.printf("%s%n", Account.translit("ТотСамыйАктерИзТогоФильма"));
//    }
//}
