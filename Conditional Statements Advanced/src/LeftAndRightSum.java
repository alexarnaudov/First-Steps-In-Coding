import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0;i<num;i++){
            int entry = Integer.parseInt(scan.nextLine()); sumLeft+=entry;
        }
        for(int i = 0;i<num;i++){
            int entry = Integer.parseInt(scan.nextLine()); sumRight+=entry;
        }
        if(sumLeft==sumRight) System.out.printf("Yes, sum = %d",sumLeft);
        if(sumLeft!=sumRight) System.out.printf("No, diff = %d",Math.abs(sumLeft-sumRight));
    }
}
