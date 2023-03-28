package ders08_ActionsClass_FakerClass_FileTest;

import org.junit.Test;

public class C03_DosyaYolu {
    @Test
    public void test(){

        // C:\Users\semiz\OneDrive\Bureau\SELENIUM\com.team113\src\test\java\ders08_ActionsClass_FakerClass_FileTest\C03_DosyaYolu.java
        // C:\Users\semiz\OneDrive\Bureau\javaBizLogo
        /*
                Java kisisel bilgisayarlarin farkliliklarindan bagimsiz
                bir dosya yolu olusturmak icin
                bize 2 kisa yol veriyor
         */

        System.out.println(System.getProperty("user.dir"));
        // icinde oldugumuz projenin dosya yolunu verir



        System.out.println(System.getProperty("user.home"));
        // kullandigimiz bilgisayarin temel dosya yolunu verir


        // Biz masaustumuzdeki abc.txt dosyasina ait dosya yolunu yazarsak

        //C:\Users\semiz\OneDriver\Bureau bundan sonra dosyanin kendisi gelir
        // bu masaustu icin gecerli diger dosyalarda farkli yollar girilmesi gerekir

        // ancak bu yazim dinamik olmaz, sadece semiz kullanicisinda calisir
        // eger dinamik yapmak istersek
        // C:\Users\semiz\OneDriver\Bureau\abc.txt  ==> System.getProperty("user.home") +"/Desktop/abc.txt"
        // /Users/ahmetbulutluoz/Downloads/xyz.jpg==> System.getProperty("user.home") + "/Downloads/xyz.jpg"
        //System.out.println("user.home") + "\\Bureau\\abc.txt";




    }

}
