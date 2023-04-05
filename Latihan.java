package coba.com;

public class Latihan {
    public static void main(String [] args) {
        System.out.println("var1 + var2 = "+penjumlahan(10,5));
        System.out.println("var1 - var2 = "+pengurangan(15,5));
        System.out.println("var1 * var2 = "+perkalian(25,25));
        System.out.println("var1 / var2 = "+pembagian(50,5));
    }
    static int penjumlahan(int var1, int var2) {
        return  var1  + var2;
    }

    static int pengurangan(int var1, int var2) {
        return  var1  - var2;
    }

    static int perkalian(int var1, int var2) {
        return  var1  * var2;
    }

    static double pembagian(double var1, double var2) {
        return  var1  / var2;
    }
}