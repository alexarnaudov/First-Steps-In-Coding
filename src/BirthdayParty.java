import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());

        System.out.printf("%.1f", price+(price*20/100)+(price/3)+(price*20/100-(price*20/100*45/100)) );
    }
}
