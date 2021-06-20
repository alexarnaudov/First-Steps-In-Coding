import java.util.Scanner;

public class CharityCampaignExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double days = Double.parseDouble(scan.nextLine());
        double bakeries = Double.parseDouble(scan.nextLine());
        double cakes = Double.parseDouble(scan.nextLine());
        double waffles = Double.parseDouble(scan.nextLine());
        double pancakes = Double.parseDouble(scan.nextLine());

        double v = (cakes * 45 + waffles * 5.80 + pancakes * 3.20) * bakeries * days;
        System.out.printf("%.2f", v -(v /8) );
    }
}
