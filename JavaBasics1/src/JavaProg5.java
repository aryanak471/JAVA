//Factorial

import java.util.Scanner;

public class JavaProg5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int i = sc.nextInt();
        int factorial = 1;

        for(int j = 1; j <= i; j++ )
        {
            factorial *= j;
        }  

        System.out.println(factorial);


    }

}
