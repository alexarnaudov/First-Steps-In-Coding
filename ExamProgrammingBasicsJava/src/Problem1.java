import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double people = Double.parseDouble(scan.nextLine());
        double nights = Double.parseDouble(scan.nextLine());
        double transport = Double.parseDouble(scan.nextLine());
        double tickets = Double.parseDouble(scan.nextLine());

        double sum = (nights*20 + transport*1.60 + tickets*6)*people;
        sum = sum + sum*0.25;
        System.out.printf("%.2f",sum);

    }
}
