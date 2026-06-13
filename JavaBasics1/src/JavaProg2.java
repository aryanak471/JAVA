import java.util.Scanner;

public class JavaProg2 {
    public static void main(String[] args){

        //Check odd even

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int i=sc.nextInt();

if(i%2==0)
{
    System.out.print("Even Number");
}

else{
    System.out.print("Odd Number");
}
    }

}

