import java.util.Scanner;

public class JavaProg3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("DONE");

        // Find largest using Math.max()
        int largest = Math.max(i, Math.max(j, k));

        // Check if all numbers are equal
        if (i == j && j == k) {
            System.out.println("All numbers are equal: " + i);
        } else {
            System.out.print(largest + " is greater than ");
            if (i != largest) System.out.print(i + " ");
            if (j != largest) System.out.print(j + " ");
            if (k != largest) System.out.print(k + " ");
            System.out.println();

            System.out.println("WORK DONE");
        }

    }
}
