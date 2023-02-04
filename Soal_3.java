/**
 * @author Roy Aziz Barera
 */
import java.util.Scanner;

public class Soal_3 {
    /* membuat sebuah function untuk mengkalkulasikan inputan 
    dengan mengembalikan nilai sesuai dengan parameter formal 
    yang di terima */
    static int calc(char O, int A, int B) { 
        switch (O) {
            case '+':
                return A + B;
            case '-':
                return A - B;
            case '*':
                return A * B;
            case '/':
                return A / B;
            case '%':
                return A % B;
            default:
                System.out.println("Invalid Operator");
                return 0;
        }
    }

    /* membuat function yang mengembalikan nilai true atau false 
    untuk mengecek apakah number yang di inputkan itu sesuai 
    dengan syarat */
    static boolean cekNum(int X){ 
        if(X >= 0 && X <= 1000)
            return true;
        else{
            System.out.print("Invalid Number " + X);
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        // navigasi penginputan
        System.out.print("Num1 Operator Num2 : "); 
        int A = keyboard.nextInt();
        char O = keyboard.next().charAt(0);
        int B = keyboard.nextInt();
        keyboard.close();

        if(cekNum(A) && cekNum(B)){
            int result = calc(O, A, B);
            System.out.println(result);
        }

    }

}
