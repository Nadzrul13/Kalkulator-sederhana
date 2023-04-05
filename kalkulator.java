package com.tugas_kalkulator;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, numbers1, numbers2, result = 0;

        System.out.println("=======Program Kalkulator Sederhana=======");
        System.out.println("1. Penjumlahan :");
        System.out.println("2. Pengurangan :");
        System.out.println("3. Perkalian :");
        System.out.println("4. Pembagian :");
        System.out.println("5. Modulo :");
        System.out.println("=================================");

        //pilihan operasi
        System.out.print("Pilih Operasi :");
        choice = input.nextInt();

        //input data
        System.out.print("Masukkan Angka Pertama :");
        numbers1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua :");
        numbers2 = input.nextInt();

        switch (choice) {
            case 1:
                result = numbers1 + numbers2;
                break;
            case 2:
                result = numbers1 - numbers2;
                break;
            case 3:
                result = numbers1 * numbers2;
                break;
            case 4:
                result = numbers1 / numbers2;
                break;
            case 5:
                result = numbers1 % numbers2;
                break;
            default:
                System.out.println("Anda Salah Memasukkan Pilihan Mohon Baca Pilihan di Menu");
        }
        System.out.println("Hasil :" +result);
    }
}
