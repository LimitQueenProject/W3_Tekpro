/**
 * @author Roy Aziz Barera
 */

import java.util.Scanner;

public class Soal_5 {
    public static void main(String args[]) {
        long total = 0; // menggunakan tipe data long untuk menampung numerik sebanyak 16 Digit
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan 4 plat mobii terpisah : ");
        for(int i = 0; i < 4; i++){
            String plat = keyboard.next();
            total = total * 10000 + Integer.parseInt(plat); // formula untuk membuat inputan menjadi satu
        }
        keyboard.close();
        // keterangan : Ada kesalahan test case pada soal 5
        if( (total - 999999) % 5 == 0){ // jika ingin berhenti pada test case 1 maka 0 ganti dengan 1
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}