/**
 * @author Roy Aziz Barera
 */

import java.util.Scanner;

public class Soal_2 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String[] s = new String[3];
        int[] n = new int[3];

        for(int i = 0; i < 3; i++){
            // Navigasi penginputan
            System.out.printf("Input ke %d : ", i+1);
            // inputan string dan keyboard
            s[i] = keyboard.next();
            n[i] = keyboard.nextInt();
            
            // jika string melebihi 10 karakter maka akan diambil 10 karakter pertama
            if(s[i].length() > 10){
                s[i] = s[i].substring(0,10);
            }
            
            // memastikan bahwa niali integer yang di inputkan melebihi 999 maka akan mengembalikan nilai 999
            n[i] = Math.min(n[i], 999);
        }
        // tutup inputan
        keyboard.close();
        
        // tampilkan ke layar
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            System.out.printf("%-15s%03d%n", s[i], n[i]);
        }
        System.out.println("================================");
            
    }
}
