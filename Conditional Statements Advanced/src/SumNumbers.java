import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for(int i =0;i<num;i++){
            int entry = Integer.parseInt(scan.nextLine());
            sum+=entry;
        }
        System.out.println(sum);
    }
}
