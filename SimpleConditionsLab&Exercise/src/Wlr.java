import java.util.Scanner;

public class Wlr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double seconds = Double.parseDouble(scan.nextLine());

        double slow = Math.floor(meters/15)*12.5;
        double result = meters*seconds+slow;

        if(result<record)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",result);
        } else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",result-record);
        }
    }
}
