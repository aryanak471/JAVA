//Sum of First N Natural Numbers

import java.util.Scanner;

public class JavaProg4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Write a 'n' number of which u want to see the sum : ");
        int i = sc.nextInt();

//        int sum = 0;
//        for(int j=1; j<=i; j++)
//        {
//                sum+= j;
//        }

        int sum = i * (i + 1) / 2;
        System.out.println("Sum = " + sum);

    }
}
