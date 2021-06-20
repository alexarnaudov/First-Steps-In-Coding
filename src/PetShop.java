import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dogFood = Double.parseDouble(scan.nextLine());
        double animalFood = Double.parseDouble(scan.nextLine());

        System.out.printf("%.1f lv.", dogFood*2.50+animalFood*4);
    }
}
