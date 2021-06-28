package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileRead
{
    public static void main(String[] args)

    {

        try {

            String coutents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("zawartosc pilku gusInfoGraphic.xml");
            System.out.print(coutents);
        }

        catch (IOException e)

        {

            System.out.println("blad wczytywania pliku gusInfoGraphic.xml => " + e.getLocalizedMessage());
            e.printStackTrace();
        }

    }
}


