/**
 *
 * @author Roy Aziz Barera
 */

import java.util.Scanner; // import package Scanner

public class Soal_1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in); // membuat objek input
        String s = keyboard.nextLine(); // input user keyboard
        keyboard.close(); // close keyboard
        // split string yang mengandung parameter regex
        String[] rgx = s.split("[ !,?._'@]+");
        System.out.println(rgx.length); // tampilkan output banyaknya String yang terpisah
        for(String i : rgx) { // tampilkan String yang sudah dipisah
            System.out.println(i);
        }
    }
}
