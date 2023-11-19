package com.meryem.odev1;

public class Atama_Operatorleri {
    public static void main(String[] args) {
        /**
         * Atama operatörleri bir değeri bir değişkene atamak için kullanılır.
         *
         * 1 -> "="   Eşitlik atama operatörüdür. Sağdaki değeri soldaki değişkene atar.
         * 2 -> "+="  Ekleyerek atama operatörüdür.Solda bulunan değere,
         *            sağdaki değeri ekleyerek tekrar soldaki değere atamama işlemini yapar.
         * 3 -> "-="  Cıkararak atama operatörüdür. Solda bulunan değere,
         *            sağdaki değeri eksilterek tekrar soldaki değere atamama işlemini yapar.
         * 4 -> "*="  Carparak atama Operatörüdür. Solda bulunan değeri,
         *            sağdaki değerle çarparak tekrar soldaki değere atamama işlemini yapar.
         * 5 -> "/="  Bölerek atama operatörüdür. Solda bulunan değeri,
         *            sağdaki değere bölerek tekrar soldaki değere atamama işlemini yapar.
         * 6 -> "/="  Mod alarak atama operatörüdür. Solda bulunan değeri,
         *          sağdaki değere bölerek kalan sonucu soldaki değere atamama işlemini yapar.
         *
         */

        //Ekleyerek Atama Operatörü Ornek
        int sayi = 5;
        System.out.println("Sayı başlangıç değer...:" + sayi);
        sayi += 3; // sayi = sayi + 3 ile aynı işlevi görür
        System.out.println("Sayı son değer...:" + sayi);

        //Azaltarak Atama Operatörü Ornek
        int sayi1 = 15;
        System.out.println("Sayı1 başlangıç değer...:" + sayi1);
        sayi1 -= 8; // sayi1 = sayi1 - 8 ile aynı işlevi görür
        System.out.println("Sayı1 son değer...:" + sayi1);

        //Carparak Atama Operatörü Ornek
        int sayi2 = 6;
        System.out.println("Sayı2 başlangıç değer...:" + sayi2);
        sayi2 *= 5; // sayi2 = sayi2 * 5 ile aynı işlevi görür
        System.out.println("Sayı2 son değer...:" + sayi2);

        //Bölerek Atama Operatörü Ornek
        int sayi3 = 18;
        System.out.println("Sayı3 başlangıç değer...:" + sayi3);
        sayi3 /= 9; // sayi3 = sayi3 / 9 ile aynı işlevi görür
        System.out.println("Sayı3 son değer...:" + sayi3);

        //Mod Alarak Atama Operatörü Ornek
        int sayi4 = 19;
        System.out.println("Sayı4 başlangıç değer...:" + sayi4);
        sayi4 %= 5; // sayi4 = sayi4 / 5 ile aynı işlevi görür
        System.out.println("Sayı4 son değer...:" + sayi4);
    }
}
