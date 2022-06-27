package pl.lublin.wsei.java.cwiczenia.lab4.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul;
    public String adresStrony;
    public String wymiary;
    public String adresGrafiki;
    public String adresMiniaturki;


    public Infografika(String tekst) {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        if (m.find())
            tytul = m.group(1);
        else
            tytul = "";



        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if (m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";


        pat = Pattern.compile("width=(\".*)");
        m = pat.matcher(tekst);
        if (m.find())
            wymiary = m.group(1);
        else
            wymiary = "";

        pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        m = pat.matcher(tekst);
        if (m.find())
            adresGrafiki = m.group(1);
        else
            adresGrafiki = "";

        pat = Pattern.compile("<description><!\\[CDATA\\[<div><img src=\"(.*) a");
        m = pat.matcher(tekst);
        if (m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "";


        System.out.println("Znaleziono tytuł:  " +tytul);
        System.out.println("Znaleziono adres strony:  " +adresStrony);
        System.out.println("Znaleziono wymiary infografiki:  " +wymiary);
        System.out.println("Znaleziono adres grafiki:  " +adresGrafiki);
        System.out.println("Znaleziono adres miniaturki:  " +adresMiniaturki);


    }
}