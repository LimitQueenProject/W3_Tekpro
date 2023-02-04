/**
 * @author Roy Aziz Barera
 */

import java.math.BigInteger;
import java.util.Scanner;
    
public class Soal_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number a : ");
        String a = keyboard.nextLine();
        System.out.print("Number b : ");
        String b = keyboard.nextLine();
        keyboard.close();
        
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);
        System.out.println(sum);
        System.out.println(product);
    }
}