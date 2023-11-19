package com.meryem.odev1;

public class Degiskenler {
    public static void main(String[] args) {
        /**
         * Java'da değişkenler, bir değeri saklamak veya tutmak için kullanılan
         * isimlendirilmiş bellek alanlarıdır. Her değişkenin bir veri türü (data type),
         * bir isim ve bir değeri vardır. Değişkenler, program içinde veri saklamak için
         * kullanılır ve programın çalışma süresince değerleri değiştirilebilir.
         *
         * veri_türü değişken_ismi = değer;
         *
         *-> veri_türü: Değişkenin saklayacağı verinin türünü belirtir. Örneğin: int, double, String, boolean, vb.
         * -> değişken_ismi: Değişkenin adıdır. Bu isim program içinde değişkeni tanımlamak ve kullanmak için kullanılır.
         * -> değer: Değişkene atanan başlangıç değeridir. Bazı durumlarda başlangıç değeri vermek zorunlu olmayabilir.
         *
         * 2 tip değişken vardır;
         *
         * 1 -> Primitive (İlkel) Veri Tipleri:
         * byte: 8-bit tamsayıları (-128 ile 127 arasında).
         * short: 16-bit tamsayıları (-32,768 ile 32,767 arasında).
         * int: 32-bit tamsayıları (-2,147,483,648 ile 2,147,483,647 arasında).
         * long: 64-bit tamsayıları (-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasında).
         * float: 32-bit kayan nokta sayılarını temsil eder.
         * double: 64-bit kayan nokta sayılarını temsil eder.
         * char: 16-bit Unicode karakterlerini temsil eder.
         * boolean: Sadece true veya false değerlerini alabilen veri türüdür.
         *
         * 2 -> Referans (Referans Tipi) Veri Tipleri:
         * String: Metin dizilerini temsil eder.
         */

        int sayi = 10; // int türünde "sayi" adında bir değişken, başlangıç değeri olarak 10'u saklar
        double pi = 3.14; // double türünde "pi" adında bir değişken, başlangıç değeri olarak 3.14'ü saklar
        String isim = "Ahmet"; // String türünde "isim" adında bir değişken, başlangıç değeri olarak "Ahmet"i saklar
        char karakter = 'A'; // Karakter değişkeni
        boolean dogruMu = true; // boolean türünde "dogruMu" adında bir değişken, başlangıç değeri olarak true veya false saklar
    }
}
