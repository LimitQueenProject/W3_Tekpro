/**
 * @author Roy Aziz Barera
 */

import java.util.Scanner;

public class Soal_4 {
    public static void main(String args[]) {
        // Input user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan jumlah penjualan agen bulan ini : ");
        int totalJual = keyboard.nextInt();
        keyboard.close();
        
        final int gajiNormal = 500000;
        final int hargaBarang = 50000;
        int bonus = 0;
        int denda = 0;

        if (totalJual < 15) {
            denda = (15 - totalJual) * hargaBarang * 15 / 100;
        } else {
            bonus = totalJual * hargaBarang * 10 / 100;
            if (totalJual >= 80) {
                bonus += totalJual * hargaBarang * 35 / 100;
            } else if (totalJual >= 40) {
                bonus += totalJual * hargaBarang * 25 / 100;
            }
        }
        int totalIncome = gajiNormal + bonus - denda;
        System.out.println(totalIncome);
    }

}
