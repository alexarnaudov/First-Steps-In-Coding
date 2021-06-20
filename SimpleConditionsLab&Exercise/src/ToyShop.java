import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        double puzzle = Double.parseDouble(scan.nextLine());
        double doll = Double.parseDouble(scan.nextLine());
        double bear = Double.parseDouble(scan.nextLine());
        double minion = Double.parseDouble(scan.nextLine());
        double truck = Double.parseDouble(scan.nextLine());

        double total = puzzle*2.60+doll*3+bear*4.10+minion*8.20+truck*2;
        if((puzzle+doll+bear+minion+truck)>=50) total = total-(total*25/100);
        total = total - (total*10/100);
        if(total>=price)
        {
          System.out.printf("Yes! %.2f lv left.",total-price);
        }
        else
        { System.out.printf("Not enough money! %.2f lv needed.",Math.abs(total-price));
        }
    }
}
