import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    double deposit = Double.parseDouble(scan.nextLine());
    double period = Double.parseDouble(scan.nextLine());
    double yearlyRate = Double.parseDouble(scan.nextLine());

    System.out.println(((deposit*yearlyRate/100)/12*period)+deposit);
    }
}
