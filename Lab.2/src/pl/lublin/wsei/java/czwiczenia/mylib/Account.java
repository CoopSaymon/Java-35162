package pl.lublin.wsei.java.czwiczenia.mylib;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;



public class Account {
    private String name;

    private static char ukrAlphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'є', 'ж', 'з', 'и', 'і', 'ї', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
            'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я'};
    private static String translitRepl[] = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "" +
            "i", "ji", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "ch", "sh", "shh", "'", "ju", "ja"};

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, " ");
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;

    }

    public static String translit(String arg)
    {

        String arg1 = arg.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < arg1.length(); i++)
        {
            for(int j = 0; j < ukrAlphabet.length; j++)
            {
                if (arg1.charAt(i) == ukrAlphabet[j])
                {
                    builder.append(translitRepl[j]);
                }
            }
        }
        return builder.toString();
    }


}













