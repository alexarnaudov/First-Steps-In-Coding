import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<num;i++)
        {
            int next = Integer.parseInt(scan.nextLine());
            if(next<=min) min = next;
            if(next>=max) max = next;
         }
        System.out.printf("Max number: %d\n",max);
        System.out.printf("Min number: %d",min);
    }
}
