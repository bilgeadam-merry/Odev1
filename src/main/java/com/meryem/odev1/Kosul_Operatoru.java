package com.meryem.odev1;

public class Kosul_Operatoru {
    public static void main(String[] args) {
        /**
         *Koşul operatörü (ternary operator), bir koşula dayalı olarak iki farklı değerden birini döndürür.
         *
         *    // koşul ? ifade1 : ifade2
         *
         *     koşul sağlanıyorsa ifade1 döner sağlanmıyorsa ifade2 döner.
         */

        int sinavNotu = 72;
        String BasariDurumu = (sinavNotu >= 60 ? ("Gecti") : ("Kaldi"));
    }
}
