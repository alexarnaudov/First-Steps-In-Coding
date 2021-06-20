import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = Double.parseDouble(scan.nextLine());
        price*=7.61;
        double discount = price - (price*0.18);
        System.out.printf("The final price is: %.2f lv.\n", discount);
        System.out.printf("The discount is: %.2f lv.", price*0.18);
    }
}
