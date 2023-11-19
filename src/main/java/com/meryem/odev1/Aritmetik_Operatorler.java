package com.meryem.odev1;

public class Aritmetik_Operatorler {
    public static void main(String[] args) {
        /**
         *Matematiksel işlemleri gerçekleştirmek için kullanılan operatörlerdir.
         *
         * 1 -> "+"  Toplama işlemi yapar
         * 2 -> "-"  Cıkarma işlemi yapr.
         * 3 -> "*"  Carpma işlemi yapar.
         * 4 -> "/"  Bölme işlemi yapar.
         * 5 -> "%"  Mod alma yani bölümden kalan bulma işlemi yapar.
         * 6 -> "++" Bir arttırma işlemi yapar. Burda dikkat edilmesi gereken nokta operatör değişkenden önce gelirse eğer
         * değer arttırılır sonra işlem yapılır ama değişkenden sonra gelirse işlem yapılır daha sonra değer arttırılır.
         * 7 -> "--" Bir azaltma işlemi yapar. Burda dikkat edilmesi gereken nokta operatör değişkenden önce gelirse eğer
         * değer azaltılır sonra işlem yapılır ama değişkenden sonra gelirse işlem yapılır daha sonra değer aazaltılır.
         *
         * NOT: "+" ve "-" tekli int değer önüne gelip değer belirmek için kullanılabilir.
         * NOT: "+" String değerleri birleştirmek için de kullanılabilir.
         */

        int a=25,b=3,c=17; //Değişken tanımlama

        // Ekleme ve Çıkarma Operatörleri Ornek
        System.out.println("A + B = "+ (a+b));
        System.out.println("A - C = "+(a-c));

        // Çarpma ve Bölme Operatörleri Ornek
        System.out.println("A * B = "+ (a*b));
        System.out.println("A / 5 = "+(a/5));

        // Mod Alma Operatörü:
        System.out.println("C % B = "+(c%b));

        // Ön Arttırma ve Azalatma Operatörü Ornek
        System.out.println("(A) Değeri: "+ a + "(++A) Değeri: "+ (++a));
        System.out.println("(B) Değeri: "+ b +"(--B) Değeri: "+(--b));

        // Sonrası Artış ve Azaltma Operatörü Ornek
        System.out.println("(A) Değeri: "+ a);
        System.out.println("(A--) Değeri: "+(--a));
        System.out.println("(B) Değeri: "+ b);
        System.out.println("(B++) Değeri: "+ (++b));

        // Stringlerde Ekleme Operatörünü Kullanırsak
        String x="benim ",y="adım Meryem";
        System.out.println("Merhaba "+(x+y));
    }
}
