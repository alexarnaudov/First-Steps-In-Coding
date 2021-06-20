import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for(int i =0;i<n;i++)
        {
            int entry = Integer.parseInt(scan.nextLine());
            if(i%2==0) {
                sumEven+=entry;
            } else
            {
                sumOdd+=entry;
            }
        }
        if(sumEven==sumOdd)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else if(sumEven!=sumOdd)
        {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEven-sumOdd));
        }

    }
}
