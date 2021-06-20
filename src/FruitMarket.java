import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceStrawberries = Double.parseDouble(scan.nextLine());
        double priceRaspberries = priceStrawberries*50/100;
        double priceOranges =priceRaspberries - priceRaspberries*40/100;
        double priceBananas = priceRaspberries - priceRaspberries*80/100;

        double bananas = Double.parseDouble(scan.nextLine());
        double oranges = Double.parseDouble(scan.nextLine());
        double raspberries = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());

       System.out.printf("%.2f", (priceBananas*bananas)+(priceOranges*oranges)+(priceRaspberries*raspberries)+(priceStrawberries*strawberries));

    }
}
