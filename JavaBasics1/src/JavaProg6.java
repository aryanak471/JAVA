//User se ek number input lo aur uska reverse print karo. Example: 123 → 321.

import java.util.Scanner;

public class JavaProg6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3 digit no.");
        int num = sc.nextInt();


        int rev = 0;
        
        while(num != 0) {
            int digit = num % 10;     // last digit nikalo
            rev = rev * 10 + digit;   // reverse me add karo
            num = num / 10;           // last digit hata do
        }

        System.out.println("Reversed Number = " + rev);

    }
}
