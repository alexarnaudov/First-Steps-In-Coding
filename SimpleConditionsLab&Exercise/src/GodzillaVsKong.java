import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double statisti = Double.parseDouble(scan.nextLine());
        double clothing = Double.parseDouble(scan.nextLine());
        double fullPrice;

if(statisti>=150) {
     fullPrice = (budget*0.1) + (statisti*clothing - statisti*clothing*0.1);
} else {
     fullPrice = budget*0.1 + statisti*clothing;
}
        if(fullPrice<=budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-fullPrice);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", fullPrice-budget);
        }
    }
}
