package pl.lublin.wsei.java.cwiczenia.test;
import pl.lublin.wsei.java.cwiczenia.Infografika;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class TestRegEx

{
    public static void main(String[] args) {

        String exItem ="\t\t<item\n>"+

			"\t\t\t<title><![CDATA[Infografika - Powszechny Spis Ludności 1921]]></title>\n"+

			"\t\t\t<pubDate><![CDATA[Tue, 09 Mar 2021 11:49:00 +0100]]></pubDate>\n"+

			"\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-powszechny-spis-ludnosci-1921,101,1.html</link>\n"+

			"\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-powszechny-spis-ludnosci-1921,101,1.html</guid>\n"+

			"\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/101/1/1/spis_powszechny_1921.jpg\" type=\"image/jpeg\" width=\"4267\" height=\"8326\">\n"+

                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n"+

				"\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/101/1/1/spis_powszechny_1921,k1uUwl-caFOE6tCTiHtf.jpg\" />\n"+

			"\t\t\t</media:content>\n"+

			"\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/101/1/1/spis_powszechny_1921,k1uUwl-caFOE6tCTiHtf.jpg\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n"+

		"\t\t</item>";



        //

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");

		Matcher m = pat.matcher(exItem);

		if (m.find())

			System.out.println("Znaleziono tytuł: "+m.group(1));

		else

			System.out.println("Nie znaleziono tytułu ...");



    }
}

