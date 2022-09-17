import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

            //BufferedReader
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // String name = br.readLine();                // Reading input from STDIN
            // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

            // Scanner scanner=new Scanner(System.in);
            // System.out.print("Enter the Number of iteration :");

            Scanner scanner=new Scanner(System.in);
            int n =scanner.nextInt();
            int fact =0;
            while(n!=0){
                int num =scanner.nextInt();
                for (int i=1;i<num;i++){
                    if (num%i==0){
                        fact+=i;
                    }

                }
                if (fact == num){
                    System.out.println("yes");

                }else {
                    System.out.println("no");
                }

                n--; }

    }
}
