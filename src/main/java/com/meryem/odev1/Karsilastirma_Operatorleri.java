package com.meryem.odev1;

public class Karsilastirma_Operatorleri {
    public static void main(String[] args) {
        /**
         * Karşılaştırma operatörleri, değerleri karşılaştırmak ve sonucunda
         * bir boolean (true veya false) değer döndürmek için kullanılır.(Bu karşılaştırmalar genellikle koşullu
         * ifadelerde veya döngülerde kullanılır ve program akışını kontrol etmek için değerlendirilir.
         *
         * 1 -> "==" eşit mi diye sorar.
         * 2 -> "!=" eşit değil mi diye sorar.
         * 3 -> ">"  büyük mü diye sorar.
         * 4 -> "<"  küçük mü diye sorar.
         * 5 -> ">=" büyük veya eşşit mi diye sorar.
         * 6 -> "<=" küçük veya eşit mi diye sorar.
         */

        //Eşitlik Operatörü Ornek
        int x = 5;
        int y = 3;
        boolean esitMi = (x == y); // esitMİ değeri false olur, çünkü x ve y birbirine eşit değildir.

        //Eşit değil Operatörü Ornek
        int a = 7;
        int b = 10;
        boolean esitDegilMi = (a != b); // esitDegilMi değeri true olur, çünkü a ve b birbirine eşit değildir.

        //Büyüktür Operatörü Ornek
        double c = 4.5;
        double d = 2.3;
        boolean buyukMu = (c > d); // buyukMu değeri true olur, çünkü c, d'den büyüktür.

        //Küçüktür Operatörü Ornek
        float e = 6.1f;
        float f = 8.9f;
        boolean KucukMu = (e < f); // KucukMu değeri true olur, çünkü e, f'ten küçüktür.

        //Büyük Eşittir Operatörü Ornek
        int g = 10;
        int h = 10;
        boolean buyukVeyaEsitMi = (g >= h); // buyukVeyaEsitMi değeri true olur, çünkü g, h'ye eşittir.

        //Küçük Eşittir Operatörü
        int i = 15;
        int j = 20;
        boolean kucukVeyaEsitMi = (i <= j); // kucukVeyaEsitMi değeri true olur, çünkü i, j'den küçüktür.
    }
}
