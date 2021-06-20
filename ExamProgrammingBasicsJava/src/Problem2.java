import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        double loveMessages = Double.parseDouble(scan.nextLine());
        double roses = Double.parseDouble(scan.nextLine());
        double keys = Double.parseDouble(scan.nextLine());
        double statues = Double.parseDouble(scan.nextLine());
        double luck = Double.parseDouble(scan.nextLine());
        double countItems = loveMessages+roses+keys+statues+luck;
        double sum = loveMessages*0.60+roses*7.20+keys*3.60+statues*18.20+luck*22;
        if(countItems>=25) sum = sum - sum*0.35;
        sum = sum - sum*0.10;

        if(sum>=price)
        {
         System.out.printf("Yes! %.2f lv left.",sum-price);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(sum-price));
        }

    }
}
