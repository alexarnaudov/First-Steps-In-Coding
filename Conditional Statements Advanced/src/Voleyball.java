import java.util.Scanner;

public class Voleyball {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeYear = scan.nextLine();
        Double p = Double.parseDouble(scan.nextLine());
        Double h = Double.parseDouble(scan.nextLine());

        double total = (48-h)*3.0/4+p*2.0/3+h;
        if(typeYear.equals("leap"))
        {
            total = total + total*0.15;
        }
        System.out.printf("%.0f",Math.floor(total));
    }
}
