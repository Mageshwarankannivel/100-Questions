import java.util.Scanner;

public class reverseSum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of iteration = ");
        int iteration =scanner.nextInt();
        int num1=0;
        int num2=0;
        while(iteration !=0){
            System.out.print("Enter the number1 & number 2 = ");
            num1= scanner.nextInt();
            num2= scanner.nextInt();

            int reverseofnum1=swapping(num1);
            int reverseofnum2=swapping(num2);
            int resultOfReverse = reverseofnum1+reverseofnum2;

            System.out.println( "The sum of reversed nuber = "+ swapping(resultOfReverse) );
            System.out.println(" ");
            iteration--;
        }
    }

    static int swapping (int num){
        int reverse=0;
        while(num>0){
            int temp = num%10;
            reverse=reverse*10 +temp;
            num/=10;
        }
        return reverse;
    }
}
