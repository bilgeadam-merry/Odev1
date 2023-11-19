package com.meryem.odev1;

public class Mantiksal_Operatorler {
    public static void main(String[] args) {
        /**
         * Mantıksal operatörler, boolean değerler üzerinde işlem yapmak için kullanılır.
         * En yaygın kullanılan mantıksal operatörler;
         *
         * 1 -> "&&" "ve" operatörü - Karşılaştırmalarda tabi tutulan değerlerin
         *  hepsinin true olduğu sürece, true değer döndürür.
         * false && false : false
         * false && true : false
         * true && false : false
         * true && true : true
         *
         * 2 -> "||" "veya" operatörü - Karşılaştırma yapılan değerlerden en az biri
         * true olduğu sürece true değer döndürür.
         * false || false : false
         * false || true : true
         * true || false : true
         * true || true : true
         *
         * 3 -> "!"  "değil" operatörü - Elde edilen boolean veri tipindeki verilerin tersini verir.
         * !false : true
         * !true : false
         */

        // Ve Operatörü Ornek
        int x = 5;
        int y = 3;
        boolean durum = (x > 0 && y > 0); // durum değeri true olur, çünkü hem x hem de y pozitif.

        //Veya Operatörü Ornek
        int a = -2;
        int b = 7;
        boolean durum2 = (a < 0 || b > 0); // durum2 değeri true olur,  b true dur ve bu yeterlidir.

        //Değil Operatörü Ornek
        boolean i = true;
        boolean k = !i;  // i artık false bir değerdir.
    }
}
